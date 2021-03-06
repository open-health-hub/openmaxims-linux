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
// This code was generated by Sean Nesbitt using IMS Development Environment (version 1.18 build 40614.1100)
// Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.

package ims.nursing.domain.impl;

import ims.domain.impl.DomainImpl;
import ims.domain.DomainFactory;
import java.util.List;
import ims.nursing.vo.domain.CarePlanTemplateTitleAssembler;
import ims.nursing.careplans.domain.objects.CarePlanTemplate;

public class CarePlanTemplatesImpl extends DomainImpl implements ims.nursing.domain.CarePlanTemplates, ims.domain.impl.Transactional
{
	/**
	* Lists Template Titles
	*/
	public ims.nursing.vo.CarePlanTemplateTitleCollection listCarePlanTemplates()
	{
		DomainFactory factory = getDomainFactory();
		List cptList = factory.listDomainObjects(CarePlanTemplate.class);
		return CarePlanTemplateTitleAssembler.createCarePlanTemplateTitleCollectionFromCarePlanTemplate(cptList).sort();
	}
}
