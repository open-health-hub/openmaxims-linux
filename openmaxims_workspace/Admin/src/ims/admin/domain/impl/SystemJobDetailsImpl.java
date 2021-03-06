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
// This code was generated by Catalin Tomozei using IMS Development Environment (version 1.71 build 3896.19006)
// Copyright (C) 1995-2010 IMS MAXIMS. All rights reserved.

package ims.admin.domain.impl;

import java.util.List;
import ims.admin.domain.SystemJobs;
import ims.admin.domain.base.impl.BaseSystemJobDetailsImpl;
import ims.admin.vo.AppUserShortVo;
import ims.admin.vo.ConfiguredJobVo;
import ims.admin.vo.SystemJobVoCollection;
import ims.admin.vo.domain.ConfiguredJobVoAssembler;
import ims.admin.vo.domain.SystemJobVoAssembler;
import ims.core.configuration.domain.objects.ConfiguredJob;
import ims.core.configuration.domain.objects.ConfiguredJobExecutionSummary;
import ims.core.configuration.vo.AppUserRefVo;
import ims.core.vo.domain.PatientDocumentVoAssembler;
import ims.core.vo.lookups.JobRunningFrequency;
import ims.domain.DomainFactory;
import ims.domain.DomainObject;
import ims.domain.IDomainGetter;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;

import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.interfaces.IConfiguredScheduledJob;

public class SystemJobDetailsImpl extends BaseSystemJobDetailsImpl
{
	private static final long serialVersionUID = 1L;

	public void test()
	{
		// TODO: Add your code here.
	}

	public ims.core.vo.PatientLiteVo getPatientByHospitalNo(String hospitalNo)
	{
		// TODO: Add your code here and change the return value.
		return null;
	}

	public void savePatientDocument(ims.core.vo.PatientDocumentVo document, ims.core.vo.DocumentConversionVo oldDocument, ims.core.vo.ConversionDetailsVo conversionDetailsVo) throws ims.domain.exceptions.StaleObjectException
	{
		// TODO: Add your code here.
	}

	public void save(ims.core.vo.ConversionDetailsVo job) throws ims.domain.exceptions.StaleObjectException
	{
		// TODO: Add your code here.
	}
	
	public ConfiguredJobVo saveSystemJobDetails(ConfiguredJobVo jobDetails) throws StaleObjectException
	{		
		if (!jobDetails.isValidated())
		{
			throw new DomainRuntimeException("This ConfiguredJobVo has not been validated");
		}
		
		DomainFactory factory = getDomainFactory();
		ConfiguredJob jobDetailsBo = ConfiguredJobVoAssembler.extractConfiguredJob(factory, jobDetails);
		factory.save(jobDetailsBo);
				
		return ConfiguredJobVoAssembler.create(jobDetailsBo);
	}	
		
	public ConfiguredJobVo getSystemJobDetailsByImsId(Integer imsId) 
	{
		SystemJobs impl = (SystemJobs) getDomainImpl(SystemJobsImpl.class);
		return impl.getSystemJobDetailsByImsId(imsId);
	}	 	
	
	public SystemJobVoCollection listAvailableSystemJobs() 
	{
		DomainFactory factory = getDomainFactory();
		String hqlString = "from SystemJob job where job.isActive = :ACTIVE";
		List jobs = factory.find(hqlString, new String[] {"ACTIVE"}, new Object[] {Boolean.TRUE});
		return SystemJobVoAssembler.createSystemJobVoCollectionFromSystemJob(jobs);
	}

	public AppUserShortVo getAppUsersShort(AppUserRefVo voRef) {
		// TODO Auto-generated method stub
		return null;
	}	

}
