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
// This code was generated by Sean Nesbitt using IMS Development Environment (version 1.45 build 2370.25160)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.admin.domain.impl;

import java.util.ArrayList;

import ims.admin.domain.base.impl.BaseExternalPersonAdminImpl;
import ims.configuration.gen.ConfigFlag;
import ims.core.generic.domain.objects.ExternalPerson;
import ims.core.generic.vo.ExternalPersonRefVo;
import ims.core.vo.ExternalPersonVo;
import ims.core.vo.ExternalPersonVoCollection;
import ims.core.vo.domain.ExternalPersonVoAssembler;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;

public class ExternalPersonAdminImpl extends BaseExternalPersonAdminImpl
{

	private static final long serialVersionUID = 1L;

	public ExternalPersonVoCollection listExternalPerson(ims.core.vo.ExternalPersonShortVo voExternalPersonFilter)
	{
		DomainFactory factory = getDomainFactory();
		ArrayList markerNames = new ArrayList();
		ArrayList markerValues = new ArrayList();
		StringBuffer filterString = new StringBuffer();
		String andStr="";
		int maxPats = ConfigFlag.DOM.PAT_SEARCH_MAX_SIZE.getValue();
		java.util.List persons = null;

		if (voExternalPersonFilter.getNameIsNotNull() && voExternalPersonFilter.getName().getSurnameIsNotNull())
		{
			String strSearchSurname = "";

			filterString.append(andStr + " p.name.upperSurname like :surname");
			markerNames.add("surname");
				
			strSearchSurname = voExternalPersonFilter.getName().getSurname().toUpperCase().trim();
			
			if(strSearchSurname.startsWith("*") )				
			{	
				if(strSearchSurname.length() >= 11)
				{
					strSearchSurname =  '%' + strSearchSurname.substring(1,11);
					strSearchSurname += '%';
				}
				else
				{
					strSearchSurname =  '%' + strSearchSurname.substring(1, strSearchSurname.length());
					strSearchSurname += '%';
				}
			}
			else 
			{
				if(strSearchSurname.length() >= 10)
				{
					strSearchSurname = strSearchSurname.substring(0,10);
					strSearchSurname += '%';
				}
				else
				{
					strSearchSurname += '%';
				}
			}
				
			markerValues.add(strSearchSurname);
			andStr = " and ";		
			
			if (voExternalPersonFilter.getIsActive()== true)
			{
				filterString.append(andStr + " p.isActive = :active");
				markerNames.add("active");
				markerValues.add(voExternalPersonFilter.getIsActive());
			}
			
			persons = factory.find("from ims.core.generic.domain.objects.ExternalPerson p where " + filterString.toString(), markerNames, markerValues, maxPats);
						
		}
		else
		{
			if (voExternalPersonFilter.getIsActive()== true)
			{
				//return all active
				filterString.append(andStr + " p.isActive = :active");
				markerNames.add("active");
				markerValues.add(voExternalPersonFilter.getIsActive());
				persons = factory.find("from ims.core.generic.domain.objects.ExternalPerson p where " + filterString.toString(), markerNames, markerValues, maxPats);			
			}
			else
			{
				//return all
				persons = factory.find("from ims.core.generic.domain.objects.ExternalPerson p");
			}
		}
		
		return ExternalPersonVoAssembler.createExternalPersonVoCollectionFromExternalPerson(persons);
	}

	public ims.core.vo.ExternalPersonVo saveExternalPerson(ims.core.vo.ExternalPersonVo externalPersonVo) throws ims.domain.exceptions.StaleObjectException
	{
		if (!externalPersonVo.isValidated())
		{
			throw new DomainRuntimeException("externalPersonVo VO has not been validated.");
		}
		DomainFactory factory = getDomainFactory();

		externalPersonVo.getName().setUppers();
		ExternalPerson doexternalPersonVo = null;

		doexternalPersonVo = ExternalPersonVoAssembler.extractExternalPerson(factory, externalPersonVo);

		factory.save(doexternalPersonVo);
				
		return ExternalPersonVoAssembler.create(doexternalPersonVo);
	}

	public ExternalPersonVo getExternalPerson(ExternalPersonRefVo voRefExternalPerson) 
	{
		DomainFactory factory = getDomainFactory();
		return ExternalPersonVoAssembler.create((ExternalPerson)factory.getDomainObject(ExternalPerson.class, voRefExternalPerson.getID_ExternalPerson()));
	}
}
