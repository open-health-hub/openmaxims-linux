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

package ims.pathways.vo;

/**
 * Linked to Pathways.AdminEvent business object (ID: 1088100011).
 */
public class AdminEventVo extends ims.pathways.vo.AdminEventRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public AdminEventVo()
	{
	}
	public AdminEventVo(Integer id, int version)
	{
		super(id, version);
	}
	public AdminEventVo(ims.pathways.vo.beans.AdminEventVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.recordingdetails = bean.getRecordingDetails() == null ? null : bean.getRecordingDetails().buildVo();
		this.eventdetails = bean.getEventDetails();
		this.outcome = bean.getOutcome() == null ? null : ims.pathways.vo.lookups.AdminEventOutcome.buildLookup(bean.getOutcome());
		this.eventmethod = bean.getEventMethod() == null ? null : ims.scheduling.vo.lookups.ConsultationMediaType.buildLookup(bean.getEventMethod());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.pathways.vo.beans.AdminEventVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.recordingdetails = bean.getRecordingDetails() == null ? null : bean.getRecordingDetails().buildVo(map);
		this.eventdetails = bean.getEventDetails();
		this.outcome = bean.getOutcome() == null ? null : ims.pathways.vo.lookups.AdminEventOutcome.buildLookup(bean.getOutcome());
		this.eventmethod = bean.getEventMethod() == null ? null : ims.scheduling.vo.lookups.ConsultationMediaType.buildLookup(bean.getEventMethod());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.pathways.vo.beans.AdminEventVoBean bean = null;
		if(map != null)
			bean = (ims.pathways.vo.beans.AdminEventVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.pathways.vo.beans.AdminEventVoBean();
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
		if(fieldName.equals("RECORDINGDETAILS"))
			return getRecordingDetails();
		if(fieldName.equals("EVENTDETAILS"))
			return getEventDetails();
		if(fieldName.equals("OUTCOME"))
			return getOutcome();
		if(fieldName.equals("EVENTMETHOD"))
			return getEventMethod();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getRecordingDetailsIsNotNull()
	{
		return this.recordingdetails != null;
	}
	public ims.core.vo.RecordingUserInformationVo getRecordingDetails()
	{
		return this.recordingdetails;
	}
	public void setRecordingDetails(ims.core.vo.RecordingUserInformationVo value)
	{
		this.isValidated = false;
		this.recordingdetails = value;
	}
	public boolean getEventDetailsIsNotNull()
	{
		return this.eventdetails != null;
	}
	public String getEventDetails()
	{
		return this.eventdetails;
	}
	public static int getEventDetailsMaxLength()
	{
		return 500;
	}
	public void setEventDetails(String value)
	{
		this.isValidated = false;
		this.eventdetails = value;
	}
	public boolean getOutcomeIsNotNull()
	{
		return this.outcome != null;
	}
	public ims.pathways.vo.lookups.AdminEventOutcome getOutcome()
	{
		return this.outcome;
	}
	public void setOutcome(ims.pathways.vo.lookups.AdminEventOutcome value)
	{
		this.isValidated = false;
		this.outcome = value;
	}
	public boolean getEventMethodIsNotNull()
	{
		return this.eventmethod != null;
	}
	public ims.scheduling.vo.lookups.ConsultationMediaType getEventMethod()
	{
		return this.eventmethod;
	}
	public void setEventMethod(ims.scheduling.vo.lookups.ConsultationMediaType value)
	{
		this.isValidated = false;
		this.eventmethod = value;
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
		if(this.recordingdetails != null)
		{
			if(!this.recordingdetails.isValidated())
			{
				this.isBusy = false;
				return false;
			}
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
		if(this.recordingdetails == null)
			listOfErrors.add("Recording Details is mandatory");
		if(this.recordingdetails != null)
		{
			String[] listOfOtherErrors = this.recordingdetails.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.eventdetails != null)
			if(this.eventdetails.length() > 500)
				listOfErrors.add("The length of the field [eventdetails] in the value object [ims.pathways.vo.AdminEventVo] is too big. It should be less or equal to 500");
		if(this.outcome == null)
			listOfErrors.add("Outcome is mandatory");
		if(this.eventmethod == null)
			listOfErrors.add("Event Method is mandatory");
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
	
		AdminEventVo clone = new AdminEventVo(this.id, this.version);
		
		if(this.recordingdetails == null)
			clone.recordingdetails = null;
		else
			clone.recordingdetails = (ims.core.vo.RecordingUserInformationVo)this.recordingdetails.clone();
		clone.eventdetails = this.eventdetails;
		if(this.outcome == null)
			clone.outcome = null;
		else
			clone.outcome = (ims.pathways.vo.lookups.AdminEventOutcome)this.outcome.clone();
		if(this.eventmethod == null)
			clone.eventmethod = null;
		else
			clone.eventmethod = (ims.scheduling.vo.lookups.ConsultationMediaType)this.eventmethod.clone();
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
		if (!(AdminEventVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A AdminEventVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((AdminEventVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((AdminEventVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.recordingdetails != null)
			count++;
		if(this.eventdetails != null)
			count++;
		if(this.outcome != null)
			count++;
		if(this.eventmethod != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected ims.core.vo.RecordingUserInformationVo recordingdetails;
	protected String eventdetails;
	protected ims.pathways.vo.lookups.AdminEventOutcome outcome;
	protected ims.scheduling.vo.lookups.ConsultationMediaType eventmethod;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
