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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.clinical.vo;

/**
 * Linked to core.clinical.IntraOperativeCareRecord business object (ID: 1072100081).
 */
public class IntraOperativeCareRecordSchedulingVo extends ims.core.clinical.vo.IntraOperativeCareRecordRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public IntraOperativeCareRecordSchedulingVo()
	{
	}
	public IntraOperativeCareRecordSchedulingVo(Integer id, int version)
	{
		super(id, version);
	}
	public IntraOperativeCareRecordSchedulingVo(ims.clinical.vo.beans.IntraOperativeCareRecordSchedulingVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.intopacutime = bean.getIntoPacuTime() == null ? null : bean.getIntoPacuTime().buildDateTime();
		this.anaesthetiststarttime = bean.getAnaesthetistStartTime() == null ? null : bean.getAnaesthetistStartTime().buildDateTime();
		this.intheatretime = bean.getInTheatreTime() == null ? null : bean.getInTheatreTime().buildDateTime();
		this.surgerystarttime = bean.getSurgeryStartTime() == null ? null : bean.getSurgeryStartTime().buildDateTime();
		this.surgeryendtime = bean.getSurgeryEndTime() == null ? null : bean.getSurgeryEndTime().buildDateTime();
		this.timeintorecovery = bean.getTimeIntoRecovery() == null ? null : bean.getTimeIntoRecovery().buildDateTime();
		this.timeoutofrecovery = bean.getTimeOutOfRecovery() == null ? null : bean.getTimeOutOfRecovery().buildDateTime();
		this.proceduredate = bean.getProcedureDate() == null ? null : bean.getProcedureDate().buildDate();
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.IntraOperativeCareRecordSchedulingVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.intopacutime = bean.getIntoPacuTime() == null ? null : bean.getIntoPacuTime().buildDateTime();
		this.anaesthetiststarttime = bean.getAnaesthetistStartTime() == null ? null : bean.getAnaesthetistStartTime().buildDateTime();
		this.intheatretime = bean.getInTheatreTime() == null ? null : bean.getInTheatreTime().buildDateTime();
		this.surgerystarttime = bean.getSurgeryStartTime() == null ? null : bean.getSurgeryStartTime().buildDateTime();
		this.surgeryendtime = bean.getSurgeryEndTime() == null ? null : bean.getSurgeryEndTime().buildDateTime();
		this.timeintorecovery = bean.getTimeIntoRecovery() == null ? null : bean.getTimeIntoRecovery().buildDateTime();
		this.timeoutofrecovery = bean.getTimeOutOfRecovery() == null ? null : bean.getTimeOutOfRecovery().buildDateTime();
		this.proceduredate = bean.getProcedureDate() == null ? null : bean.getProcedureDate().buildDate();
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.IntraOperativeCareRecordSchedulingVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.IntraOperativeCareRecordSchedulingVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.IntraOperativeCareRecordSchedulingVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("INTOPACUTIME"))
			return getIntoPacuTime();
		if(fieldName.equals("ANAESTHETISTSTARTTIME"))
			return getAnaesthetistStartTime();
		if(fieldName.equals("INTHEATRETIME"))
			return getInTheatreTime();
		if(fieldName.equals("SURGERYSTARTTIME"))
			return getSurgeryStartTime();
		if(fieldName.equals("SURGERYENDTIME"))
			return getSurgeryEndTime();
		if(fieldName.equals("TIMEINTORECOVERY"))
			return getTimeIntoRecovery();
		if(fieldName.equals("TIMEOUTOFRECOVERY"))
			return getTimeOutOfRecovery();
		if(fieldName.equals("PROCEDUREDATE"))
			return getProcedureDate();
		if(fieldName.equals("SYSINFO"))
			return getSysInfo();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getIntoPacuTimeIsNotNull()
	{
		return this.intopacutime != null;
	}
	public ims.framework.utils.DateTime getIntoPacuTime()
	{
		return this.intopacutime;
	}
	public void setIntoPacuTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.intopacutime = value;
	}
	public boolean getAnaesthetistStartTimeIsNotNull()
	{
		return this.anaesthetiststarttime != null;
	}
	public ims.framework.utils.DateTime getAnaesthetistStartTime()
	{
		return this.anaesthetiststarttime;
	}
	public void setAnaesthetistStartTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.anaesthetiststarttime = value;
	}
	public boolean getInTheatreTimeIsNotNull()
	{
		return this.intheatretime != null;
	}
	public ims.framework.utils.DateTime getInTheatreTime()
	{
		return this.intheatretime;
	}
	public void setInTheatreTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.intheatretime = value;
	}
	public boolean getSurgeryStartTimeIsNotNull()
	{
		return this.surgerystarttime != null;
	}
	public ims.framework.utils.DateTime getSurgeryStartTime()
	{
		return this.surgerystarttime;
	}
	public void setSurgeryStartTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.surgerystarttime = value;
	}
	public boolean getSurgeryEndTimeIsNotNull()
	{
		return this.surgeryendtime != null;
	}
	public ims.framework.utils.DateTime getSurgeryEndTime()
	{
		return this.surgeryendtime;
	}
	public void setSurgeryEndTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.surgeryendtime = value;
	}
	public boolean getTimeIntoRecoveryIsNotNull()
	{
		return this.timeintorecovery != null;
	}
	public ims.framework.utils.DateTime getTimeIntoRecovery()
	{
		return this.timeintorecovery;
	}
	public void setTimeIntoRecovery(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.timeintorecovery = value;
	}
	public boolean getTimeOutOfRecoveryIsNotNull()
	{
		return this.timeoutofrecovery != null;
	}
	public ims.framework.utils.DateTime getTimeOutOfRecovery()
	{
		return this.timeoutofrecovery;
	}
	public void setTimeOutOfRecovery(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.timeoutofrecovery = value;
	}
	public boolean getProcedureDateIsNotNull()
	{
		return this.proceduredate != null;
	}
	public ims.framework.utils.Date getProcedureDate()
	{
		return this.proceduredate;
	}
	public void setProcedureDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.proceduredate = value;
	}
	public boolean getSysInfoIsNotNull()
	{
		return this.sysinfo != null;
	}
	public ims.vo.SystemInformation getSysInfo()
	{
		return this.sysinfo;
	}
	public void setSysInfo(ims.vo.SystemInformation value)
	{
		this.isValidated = false;
		this.sysinfo = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.proceduredate == null)
			listOfErrors.add("ProcedureDate is mandatory");
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		IntraOperativeCareRecordSchedulingVo clone = new IntraOperativeCareRecordSchedulingVo(this.id, this.version);
		
		if(this.intopacutime == null)
			clone.intopacutime = null;
		else
			clone.intopacutime = (ims.framework.utils.DateTime)this.intopacutime.clone();
		if(this.anaesthetiststarttime == null)
			clone.anaesthetiststarttime = null;
		else
			clone.anaesthetiststarttime = (ims.framework.utils.DateTime)this.anaesthetiststarttime.clone();
		if(this.intheatretime == null)
			clone.intheatretime = null;
		else
			clone.intheatretime = (ims.framework.utils.DateTime)this.intheatretime.clone();
		if(this.surgerystarttime == null)
			clone.surgerystarttime = null;
		else
			clone.surgerystarttime = (ims.framework.utils.DateTime)this.surgerystarttime.clone();
		if(this.surgeryendtime == null)
			clone.surgeryendtime = null;
		else
			clone.surgeryendtime = (ims.framework.utils.DateTime)this.surgeryendtime.clone();
		if(this.timeintorecovery == null)
			clone.timeintorecovery = null;
		else
			clone.timeintorecovery = (ims.framework.utils.DateTime)this.timeintorecovery.clone();
		if(this.timeoutofrecovery == null)
			clone.timeoutofrecovery = null;
		else
			clone.timeoutofrecovery = (ims.framework.utils.DateTime)this.timeoutofrecovery.clone();
		if(this.proceduredate == null)
			clone.proceduredate = null;
		else
			clone.proceduredate = (ims.framework.utils.Date)this.proceduredate.clone();
		if(this.sysinfo == null)
			clone.sysinfo = null;
		else
			clone.sysinfo = (ims.vo.SystemInformation)this.sysinfo.clone();
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(IntraOperativeCareRecordSchedulingVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A IntraOperativeCareRecordSchedulingVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		IntraOperativeCareRecordSchedulingVo compareObj = (IntraOperativeCareRecordSchedulingVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getProcedureDate() == null && compareObj.getProcedureDate() != null)
				return -1;
			if(this.getProcedureDate() != null && compareObj.getProcedureDate() == null)
				return 1;
			if(this.getProcedureDate() != null && compareObj.getProcedureDate() != null)
				retVal = this.getProcedureDate().compareTo(compareObj.getProcedureDate());
		}
		if (retVal == 0)
		{
			if(this.getSysInfo() == null && compareObj.getSysInfo() != null)
				return -1;
			if(this.getSysInfo() != null && compareObj.getSysInfo() == null)
				return 1;
			if(this.getSysInfo() != null && compareObj.getSysInfo() != null)
				retVal = this.getSysInfo().compareTo(compareObj.getSysInfo());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.intopacutime != null)
			count++;
		if(this.anaesthetiststarttime != null)
			count++;
		if(this.intheatretime != null)
			count++;
		if(this.surgerystarttime != null)
			count++;
		if(this.surgeryendtime != null)
			count++;
		if(this.timeintorecovery != null)
			count++;
		if(this.timeoutofrecovery != null)
			count++;
		if(this.proceduredate != null)
			count++;
		if(this.sysinfo != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 9;
	}
	protected ims.framework.utils.DateTime intopacutime;
	protected ims.framework.utils.DateTime anaesthetiststarttime;
	protected ims.framework.utils.DateTime intheatretime;
	protected ims.framework.utils.DateTime surgerystarttime;
	protected ims.framework.utils.DateTime surgeryendtime;
	protected ims.framework.utils.DateTime timeintorecovery;
	protected ims.framework.utils.DateTime timeoutofrecovery;
	protected ims.framework.utils.Date proceduredate;
	protected ims.vo.SystemInformation sysinfo;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
