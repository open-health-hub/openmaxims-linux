//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Neil McAnaspie using IMS Development Environment (version 1.22 build 41222.900)
// Copyright (C) 1995-2005 IMS MAXIMS plc. All rights reserved.

package ims.spinalinjuries.domain.impl;

import java.util.ArrayList;
import java.util.List;
import ims.admin.domain.HcpAdmin;
import ims.admin.domain.impl.HcpAdminImpl;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.clinical.domain.objects.AdviceLeaflets;
import ims.core.clinical.vo.AdviceLeafletsRefVo;
import ims.core.vo.AdviceLeafletsVo;
import ims.core.vo.AdviceLeafletsVoCollection;
import ims.core.vo.HcpCollection;
import ims.core.vo.HcpFilter;
import ims.core.vo.domain.AdviceLeafletsVoAssembler;
import ims.core.vo.lookups.AdviceLeafletGivenTo;
import ims.domain.DomainFactory;
import ims.domain.DomainObject;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.framework.exceptions.CodingRuntimeException;

public class AdviceLeafletsImpl extends DomainImpl implements ims.spinalinjuries.domain.AdviceLeaflets, ims.domain.impl.Transactional
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdviceLeafletsVoCollection listAdviceLeaflets(CareContextRefVo refCareContext) 
	{
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer(" ");
		String query = "from AdviceLeaflets t ";
		ArrayList markers = new ArrayList();
		ArrayList values = new ArrayList();
		String andStr = " ";

		if (refCareContext != null)
		{
			hql.append(andStr + " t.careContext.id = :cc");
			markers.add("cc");
			values.add(refCareContext.getID_CareContext());
			andStr = " and ";
		}

		if (markers.size() > 0) query += " where ";
		query += hql.toString();
		List adviceList = factory.find(query, markers, values);							
		return AdviceLeafletsVoAssembler.createAdviceLeafletsVoCollectionFromAdviceLeaflets(adviceList);
		
	}

	public HcpCollection listHcps(HcpFilter filter) 
	{
		HcpAdmin hcpAdmin = (HcpAdmin)getDomainImpl(HcpAdminImpl.class);
		return hcpAdmin.listHCPs(filter);
	}

	public AdviceLeafletsVo saveAdviceLeafletsDetails(AdviceLeafletsVo adviceleaflets) throws StaleObjectException
	{
		if(adviceleaflets == null)
			throw new RuntimeException("Cannot save null value for AdviceLeafletsVo ");
		
		if (!adviceleaflets.isValidated())
			throw new DomainRuntimeException("Advice leaflets has not been validated");

		DomainFactory factory = getDomainFactory();

		ims.core.clinical.domain.objects.AdviceLeaflets doAdviceLeaflets = AdviceLeafletsVoAssembler.extractAdviceLeaflets(factory, adviceleaflets);
		
		factory.save(doAdviceLeaflets);
		
		return AdviceLeafletsVoAssembler.create(doAdviceLeaflets);
	}

	//WDEV-7044
	public AdviceLeafletsVo getAdviceLeaflets(AdviceLeafletsRefVo record)
	{
		if(record == null || record.getID_AdviceLeaflets() == null)
			throw new CodingRuntimeException("Can not get AdviceLeaflet on null Id.");
		
		DomainFactory factory = getDomainFactory();
		AdviceLeaflets doLeaflet = (AdviceLeaflets) factory.getDomainObject(AdviceLeaflets.class, record.getID_AdviceLeaflets());
		
		return AdviceLeafletsVoAssembler.create(doLeaflet);
	}
}
