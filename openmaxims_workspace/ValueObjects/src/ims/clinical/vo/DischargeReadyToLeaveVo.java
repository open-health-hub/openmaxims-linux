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
 * Linked to eDischarge.ReadyToLeave business object (ID: 1099100006).
 */
public class DischargeReadyToLeaveVo extends ims.edischarge.vo.ReadyToLeaveRefVo implements ims.vo.ImsCloneable, Comparable, ims.vo.interfaces.IEDischargeSummary
{
	private static final long serialVersionUID = 1L;

	public DischargeReadyToLeaveVo()
	{
	}
	public DischargeReadyToLeaveVo(Integer id, int version)
	{
		super(id, version);
	}
	public DischargeReadyToLeaveVo(ims.clinical.vo.beans.DischargeReadyToLeaveVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.authoringinfo = bean.getAuthoringInfo() == null ? null : bean.getAuthoringInfo().buildVo();
		this.nurseenableddischargeconfirmation = bean.getNurseEnabledDischargeConfirmation();
		this.completedon = bean.getCompletedOn() == null ? null : bean.getCompletedOn().buildDateTime();
		this.completedby = bean.getCompletedBy() == null ? null : new ims.core.resource.people.vo.HcpRefVo(new Integer(bean.getCompletedBy().getId()), bean.getCompletedBy().getVersion());
		this.dischargedetails = bean.getDischargeDetails() == null ? null : bean.getDischargeDetails().buildVo();
		this.haspatientreceivedcopyofdischarge = bean.getHasPatientReceivedCopyOfDischarge();
		this.commentsfrompatient = bean.getCommentsFromPatient();
		this.dischargingnurse = bean.getDischargingNurse() == null ? null : bean.getDischargingNurse().buildVo();
		this.admittedon = bean.getAdmittedOn() == null ? null : bean.getAdmittedOn().buildDate();
		this.clinicaldischargedatetime = bean.getClinicalDischargeDateTime() == null ? null : bean.getClinicalDischargeDateTime().buildDateTime();
		this.admittedtime = bean.getAdmittedTime() == null ? null : bean.getAdmittedTime().buildTime();
		this.iscomplete = bean.getIsComplete();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.DischargeReadyToLeaveVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.authoringinfo = bean.getAuthoringInfo() == null ? null : bean.getAuthoringInfo().buildVo(map);
		this.nurseenableddischargeconfirmation = bean.getNurseEnabledDischargeConfirmation();
		this.completedon = bean.getCompletedOn() == null ? null : bean.getCompletedOn().buildDateTime();
		this.completedby = bean.getCompletedBy() == null ? null : new ims.core.resource.people.vo.HcpRefVo(new Integer(bean.getCompletedBy().getId()), bean.getCompletedBy().getVersion());
		this.dischargedetails = bean.getDischargeDetails() == null ? null : bean.getDischargeDetails().buildVo(map);
		this.haspatientreceivedcopyofdischarge = bean.getHasPatientReceivedCopyOfDischarge();
		this.commentsfrompatient = bean.getCommentsFromPatient();
		this.dischargingnurse = bean.getDischargingNurse() == null ? null : bean.getDischargingNurse().buildVo(map);
		this.admittedon = bean.getAdmittedOn() == null ? null : bean.getAdmittedOn().buildDate();
		this.clinicaldischargedatetime = bean.getClinicalDischargeDateTime() == null ? null : bean.getClinicalDischargeDateTime().buildDateTime();
		this.admittedtime = bean.getAdmittedTime() == null ? null : bean.getAdmittedTime().buildTime();
		this.iscomplete = bean.getIsComplete();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.DischargeReadyToLeaveVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.DischargeReadyToLeaveVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.DischargeReadyToLeaveVoBean();
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
		if(fieldName.equals("CARECONTEXT"))
			return getCareContext();
		if(fieldName.equals("AUTHORINGINFO"))
			return getAuthoringInfo();
		if(fieldName.equals("NURSEENABLEDDISCHARGECONFIRMATION"))
			return getNurseEnabledDischargeConfirmation();
		if(fieldName.equals("COMPLETEDON"))
			return getCompletedOn();
		if(fieldName.equals("COMPLETEDBY"))
			return getCompletedBy();
		if(fieldName.equals("DISCHARGEDETAILS"))
			return getDischargeDetails();
		if(fieldName.equals("HASPATIENTRECEIVEDCOPYOFDISCHARGE"))
			return getHasPatientReceivedCopyOfDischarge();
		if(fieldName.equals("COMMENTSFROMPATIENT"))
			return getCommentsFromPatient();
		if(fieldName.equals("DISCHARGINGNURSE"))
			return getDischargingNurse();
		if(fieldName.equals("ADMITTEDON"))
			return getAdmittedOn();
		if(fieldName.equals("CLINICALDISCHARGEDATETIME"))
			return getClinicalDischargeDateTime();
		if(fieldName.equals("ADMITTEDTIME"))
			return getAdmittedTime();
		if(fieldName.equals("ISCOMPLETE"))
			return getIsComplete();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getCareContextIsNotNull()
	{
		return this.carecontext != null;
	}
	public ims.core.admin.vo.CareContextRefVo getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.core.admin.vo.CareContextRefVo value)
	{
		this.isValidated = false;
		this.carecontext = value;
	}
	public boolean getAuthoringInfoIsNotNull()
	{
		return this.authoringinfo != null;
	}
	public ims.core.vo.AuthoringInformationVo getAuthoringInfo()
	{
		return this.authoringinfo;
	}
	public void setAuthoringInfo(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.authoringinfo = value;
	}
	public boolean getNurseEnabledDischargeConfirmationIsNotNull()
	{
		return this.nurseenableddischargeconfirmation != null;
	}
	public String getNurseEnabledDischargeConfirmation()
	{
		return this.nurseenableddischargeconfirmation;
	}
	public static int getNurseEnabledDischargeConfirmationMaxLength()
	{
		return 5000;
	}
	public void setNurseEnabledDischargeConfirmation(String value)
	{
		this.isValidated = false;
		this.nurseenableddischargeconfirmation = value;
	}
	public boolean getCompletedOnIsNotNull()
	{
		return this.completedon != null;
	}
	public ims.framework.utils.DateTime getCompletedOn()
	{
		return this.completedon;
	}
	public void setCompletedOn(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.completedon = value;
	}
	public boolean getCompletedByIsNotNull()
	{
		return this.completedby != null;
	}
	public ims.core.resource.people.vo.HcpRefVo getCompletedBy()
	{
		return this.completedby;
	}
	public void setCompletedBy(ims.core.resource.people.vo.HcpRefVo value)
	{
		this.isValidated = false;
		this.completedby = value;
	}
	public boolean getDischargeDetailsIsNotNull()
	{
		return this.dischargedetails != null;
	}
	public ims.clinical.vo.DischargeDetailsVo getDischargeDetails()
	{
		return this.dischargedetails;
	}
	public void setDischargeDetails(ims.clinical.vo.DischargeDetailsVo value)
	{
		this.isValidated = false;
		this.dischargedetails = value;
	}
	public boolean getHasPatientReceivedCopyOfDischargeIsNotNull()
	{
		return this.haspatientreceivedcopyofdischarge != null;
	}
	public Boolean getHasPatientReceivedCopyOfDischarge()
	{
		return this.haspatientreceivedcopyofdischarge;
	}
	public void setHasPatientReceivedCopyOfDischarge(Boolean value)
	{
		this.isValidated = false;
		this.haspatientreceivedcopyofdischarge = value;
	}
	public boolean getCommentsFromPatientIsNotNull()
	{
		return this.commentsfrompatient != null;
	}
	public String getCommentsFromPatient()
	{
		return this.commentsfrompatient;
	}
	public static int getCommentsFromPatientMaxLength()
	{
		return 5000;
	}
	public void setCommentsFromPatient(String value)
	{
		this.isValidated = false;
		this.commentsfrompatient = value;
	}
	public boolean getDischargingNurseIsNotNull()
	{
		return this.dischargingnurse != null;
	}
	public ims.core.vo.HcpLiteVo getDischargingNurse()
	{
		return this.dischargingnurse;
	}
	public void setDischargingNurse(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.dischargingnurse = value;
	}
	public boolean getAdmittedOnIsNotNull()
	{
		return this.admittedon != null;
	}
	public ims.framework.utils.Date getAdmittedOn()
	{
		return this.admittedon;
	}
	public void setAdmittedOn(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.admittedon = value;
	}
	public boolean getClinicalDischargeDateTimeIsNotNull()
	{
		return this.clinicaldischargedatetime != null;
	}
	public ims.framework.utils.DateTime getClinicalDischargeDateTime()
	{
		return this.clinicaldischargedatetime;
	}
	public void setClinicalDischargeDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.clinicaldischargedatetime = value;
	}
	public boolean getAdmittedTimeIsNotNull()
	{
		return this.admittedtime != null;
	}
	public ims.framework.utils.Time getAdmittedTime()
	{
		return this.admittedtime;
	}
	public void setAdmittedTime(ims.framework.utils.Time value)
	{
		this.isValidated = false;
		this.admittedtime = value;
	}
	public boolean getIsCompleteIsNotNull()
	{
		return this.iscomplete != null;
	}
	public Boolean getIsComplete()
	{
		return this.iscomplete;
	}
	public void setIsComplete(Boolean value)
	{
		this.isValidated = false;
		this.iscomplete = value;
	}
	/**
	* IEDischargeSummary interface methods
	*/
	public Boolean getIEDischargeSummaryIsComplete()
	{
		return iscomplete != null ? iscomplete : false;
	}
	public ims.clinical.vo.lookups.EDischargeSummarySection getIEDischargeSummarySection()
	{
		return ims.clinical.vo.lookups.EDischargeSummarySection.READY_TO_LEAVE;
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
		if(this.authoringinfo != null)
		{
			if(!this.authoringinfo.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.dischargedetails != null)
		{
			if(!this.dischargedetails.isValidated())
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
		if(this.carecontext == null)
			listOfErrors.add("CareContext is mandatory");
		if(this.authoringinfo != null)
		{
			String[] listOfOtherErrors = this.authoringinfo.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.dischargedetails != null)
		{
			String[] listOfOtherErrors = this.dischargedetails.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
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
	
		DischargeReadyToLeaveVo clone = new DischargeReadyToLeaveVo(this.id, this.version);
		
		clone.carecontext = this.carecontext;
		if(this.authoringinfo == null)
			clone.authoringinfo = null;
		else
			clone.authoringinfo = (ims.core.vo.AuthoringInformationVo)this.authoringinfo.clone();
		clone.nurseenableddischargeconfirmation = this.nurseenableddischargeconfirmation;
		if(this.completedon == null)
			clone.completedon = null;
		else
			clone.completedon = (ims.framework.utils.DateTime)this.completedon.clone();
		clone.completedby = this.completedby;
		if(this.dischargedetails == null)
			clone.dischargedetails = null;
		else
			clone.dischargedetails = (ims.clinical.vo.DischargeDetailsVo)this.dischargedetails.clone();
		clone.haspatientreceivedcopyofdischarge = this.haspatientreceivedcopyofdischarge;
		clone.commentsfrompatient = this.commentsfrompatient;
		if(this.dischargingnurse == null)
			clone.dischargingnurse = null;
		else
			clone.dischargingnurse = (ims.core.vo.HcpLiteVo)this.dischargingnurse.clone();
		if(this.admittedon == null)
			clone.admittedon = null;
		else
			clone.admittedon = (ims.framework.utils.Date)this.admittedon.clone();
		if(this.clinicaldischargedatetime == null)
			clone.clinicaldischargedatetime = null;
		else
			clone.clinicaldischargedatetime = (ims.framework.utils.DateTime)this.clinicaldischargedatetime.clone();
		if(this.admittedtime == null)
			clone.admittedtime = null;
		else
			clone.admittedtime = (ims.framework.utils.Time)this.admittedtime.clone();
		clone.iscomplete = this.iscomplete;
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
		if (!(DischargeReadyToLeaveVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A DischargeReadyToLeaveVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((DischargeReadyToLeaveVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((DischargeReadyToLeaveVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.carecontext != null)
			count++;
		if(this.authoringinfo != null)
			count++;
		if(this.nurseenableddischargeconfirmation != null)
			count++;
		if(this.completedon != null)
			count++;
		if(this.completedby != null)
			count++;
		if(this.dischargedetails != null)
			count++;
		if(this.haspatientreceivedcopyofdischarge != null)
			count++;
		if(this.commentsfrompatient != null)
			count++;
		if(this.dischargingnurse != null)
			count++;
		if(this.admittedon != null)
			count++;
		if(this.clinicaldischargedatetime != null)
			count++;
		if(this.admittedtime != null)
			count++;
		if(this.iscomplete != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 13;
	}
	protected ims.core.admin.vo.CareContextRefVo carecontext;
	protected ims.core.vo.AuthoringInformationVo authoringinfo;
	protected String nurseenableddischargeconfirmation;
	protected ims.framework.utils.DateTime completedon;
	protected ims.core.resource.people.vo.HcpRefVo completedby;
	protected ims.clinical.vo.DischargeDetailsVo dischargedetails;
	protected Boolean haspatientreceivedcopyofdischarge;
	protected String commentsfrompatient;
	protected ims.core.vo.HcpLiteVo dischargingnurse;
	protected ims.framework.utils.Date admittedon;
	protected ims.framework.utils.DateTime clinicaldischargedatetime;
	protected ims.framework.utils.Time admittedtime;
	protected Boolean iscomplete;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
