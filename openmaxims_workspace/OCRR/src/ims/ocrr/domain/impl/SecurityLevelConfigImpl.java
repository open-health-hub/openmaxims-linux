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
// This code was generated by Daniel Laffan using IMS Development Environment (version 1.71 build 3716.26758)
// Copyright (C) 1995-2010 IMS MAXIMS. All rights reserved.

package ims.ocrr.domain.impl;

import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.domain.exceptions.UnqViolationUncheckedException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.ocrr.configuration.domain.objects.SecurityLevel;
import ims.ocrr.domain.base.impl.BaseSecurityLevelConfigImpl;
import ims.ocrr.vo.SecurityLevelConfigVoCollection;
import ims.ocrr.vo.domain.SecurityLevelConfigVoAssembler;

import java.util.Iterator;
import java.util.List;

public class SecurityLevelConfigImpl extends BaseSecurityLevelConfigImpl
{

	private static final long serialVersionUID = 1L;

	/**
	* saveSecurityLevel
	*/
	public void saveSecurityLevel(ims.ocrr.vo.SecurityLevelConfigVo voSecurityLevel) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException
	{
		if (voSecurityLevel == null)
			throw new CodingRuntimeException("voSecurityLevel is null in method saveSecurityLevel");
		if (!voSecurityLevel.isValidated())
			throw new CodingRuntimeException("voSecurityLevel has not been validated in method saveSecurityLevel");
				
		try
		{
			getDomainFactory().save(SecurityLevelConfigVoAssembler.extractSecurityLevel(getDomainFactory(), voSecurityLevel));
		}
		catch (UnqViolationUncheckedException e)
		{
			throw new UniqueKeyViolationException("A record with the same name already exists, Please Change.");
		}
	}

	/**
	* saveSecurityLevelSwop - method will be used to swap the security level in one transaction
	*/
	public void saveSecurityLevelSwop(ims.ocrr.vo.SecurityLevelConfigVo voSecurityLevelUp, ims.ocrr.vo.SecurityLevelConfigVo voSecurityLevelDown) throws ims.domain.exceptions.StaleObjectException
	{
		if (voSecurityLevelUp == null || voSecurityLevelDown == null)
			throw new CodingRuntimeException("voSecurityLevelUp or voSecurityLevelDown are null in method saveSecurityLevel");
		
		getDomainFactory().save(SecurityLevelConfigVoAssembler.extractSecurityLevel(getDomainFactory(), voSecurityLevelUp));
		getDomainFactory().save(SecurityLevelConfigVoAssembler.extractSecurityLevel(getDomainFactory(), voSecurityLevelDown));
	}

	/**
	* deleteSecurityLevel - delete record and then reorder the collection that remains
	*/
	public void deleteSecurityLevel(ims.ocrr.configuration.vo.SecurityLevelRefVo voSecurityLevel, SecurityLevelConfigVoCollection voCollSecurityLevel) throws ims.domain.exceptions.ForeignKeyViolationException, StaleObjectException
	{
		if (voSecurityLevel == null)
			throw new CodingRuntimeException("voSecurityLevel is null in method deleteSecurityLevel");
		
		getDomainFactory().delete(getDomainFactory().getDomainObject(voSecurityLevel));
		
		//only reorder collection if records exist
		if(voCollSecurityLevel == null || voCollSecurityLevel.size() == 0)
			return;
		
		List lstSecurityLevel = SecurityLevelConfigVoAssembler.extractSecurityLevelList(getDomainFactory(), voCollSecurityLevel);
		if(lstSecurityLevel != null)
		{
			Iterator it = lstSecurityLevel.iterator();
			while(it.hasNext())
			{
				SecurityLevel doSecurityLevel =  (SecurityLevel)it.next();
				getDomainFactory().save(doSecurityLevel);
			}
		}
	}

	/**
	* listSecurityLevel - ordered by SecurityLevel
	*/
	public ims.ocrr.vo.SecurityLevelConfigVoCollection listSecurityLevel()
	{
		String hql = "from SecurityLevel sec order by sec.securityLevel asc";
		List lstSecs = getDomainFactory().find(hql);
		return SecurityLevelConfigVoAssembler.createSecurityLevelConfigVoCollectionFromSecurityLevel(lstSecs);
	}
}
