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
 * Linked to core.admin.pas.Inpatient Episode business object (ID: 1014100000).
 */
public class InpatientEpisodeForVTERiskAsessmentVo extends ims.core.admin.pas.vo.InpatientEpisodeRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public InpatientEpisodeForVTERiskAsessmentVo()
	{
	}
	public InpatientEpisodeForVTERiskAsessmentVo(Integer id, int version)
	{
		super(id, version);
	}
	public InpatientEpisodeForVTERiskAsessmentVo(ims.clinical.vo.beans.InpatientEpisodeForVTERiskAsessmentVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.pasevent = bean.getPasEvent() == null ? null : new ims.core.admin.pas.vo.PASEventRefVo(new Integer(bean.getPasEvent().getId()), bean.getPasEvent().getVersion());
		this.admissiondatetime = bean.getAdmissionDateTime() == null ? null : bean.getAdmissionDateTime().buildDateTime();
		this.vteassessmentstatus = bean.getVTEAssessmentStatus() == null ? null : ims.clinical.vo.lookups.VTEAsessmentStatus.buildLookup(bean.getVTEAssessmentStatus());
		this.vteriskassessment = bean.getVTERiskAssessment() == null ? null : new ims.core.clinical.vo.VTERiskAssessmentRefVo(new Integer(bean.getVTERiskAssessment().getId()), bean.getVTERiskAssessment().getVersion());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.InpatientEpisodeForVTERiskAsessmentVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.pasevent = bean.getPasEvent() == null ? null : new ims.core.admin.pas.vo.PASEventRefVo(new Integer(bean.getPasEvent().getId()), bean.getPasEvent().getVersion());
		this.admissiondatetime = bean.getAdmissionDateTime() == null ? null : bean.getAdmissionDateTime().buildDateTime();
		this.vteassessmentstatus = bean.getVTEAssessmentStatus() == null ? null : ims.clinical.vo.lookups.VTEAsessmentStatus.buildLookup(bean.getVTEAssessmentStatus());
		this.vteriskassessment = bean.getVTERiskAssessment() == null ? null : new ims.core.clinical.vo.VTERiskAssessmentRefVo(new Integer(bean.getVTERiskAssessment().getId()), bean.getVTERiskAssessment().getVersion());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.InpatientEpisodeForVTERiskAsessmentVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.InpatientEpisodeForVTERiskAsessmentVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.InpatientEpisodeForVTERiskAsessmentVoBean();
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
		if(fieldName.equals("PASEVENT"))
			return getPasEvent();
		if(fieldName.equals("ADMISSIONDATETIME"))
			return getAdmissionDateTime();
		if(fieldName.equals("VTEASSESSMENTSTATUS"))
			return getVTEAssessmentStatus();
		if(fieldName.equals("VTERISKASSESSMENT"))
			return getVTERiskAssessment();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPasEventIsNotNull()
	{
		return this.pasevent != null;
	}
	public ims.core.admin.pas.vo.PASEventRefVo getPasEvent()
	{
		return this.pasevent;
	}
	public void setPasEvent(ims.core.admin.pas.vo.PASEventRefVo value)
	{
		this.isValidated = false;
		this.pasevent = value;
	}
	public boolean getAdmissionDateTimeIsNotNull()
	{
		return this.admissiondatetime != null;
	}
	public ims.framework.utils.DateTime getAdmissionDateTime()
	{
		return this.admissiondatetime;
	}
	public void setAdmissionDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.admissiondatetime = value;
	}
	public boolean getVTEAssessmentStatusIsNotNull()
	{
		return this.vteassessmentstatus != null;
	}
	public ims.clinical.vo.lookups.VTEAsessmentStatus getVTEAssessmentStatus()
	{
		return this.vteassessmentstatus;
	}
	public void setVTEAssessmentStatus(ims.clinical.vo.lookups.VTEAsessmentStatus value)
	{
		this.isValidated = false;
		this.vteassessmentstatus = value;
	}
	public boolean getVTERiskAssessmentIsNotNull()
	{
		return this.vteriskassessment != null;
	}
	public ims.core.clinical.vo.VTERiskAssessmentRefVo getVTERiskAssessment()
	{
		return this.vteriskassessment;
	}
	public void setVTERiskAssessment(ims.core.clinical.vo.VTERiskAssessmentRefVo value)
	{
		this.isValidated = false;
		this.vteriskassessment = value;
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
	
		InpatientEpisodeForVTERiskAsessmentVo clone = new InpatientEpisodeForVTERiskAsessmentVo(this.id, this.version);
		
		clone.pasevent = this.pasevent;
		if(this.admissiondatetime == null)
			clone.admissiondatetime = null;
		else
			clone.admissiondatetime = (ims.framework.utils.DateTime)this.admissiondatetime.clone();
		if(this.vteassessmentstatus == null)
			clone.vteassessmentstatus = null;
		else
			clone.vteassessmentstatus = (ims.clinical.vo.lookups.VTEAsessmentStatus)this.vteassessmentstatus.clone();
		clone.vteriskassessment = this.vteriskassessment;
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
		if (!(InpatientEpisodeForVTERiskAsessmentVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A InpatientEpisodeForVTERiskAsessmentVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((InpatientEpisodeForVTERiskAsessmentVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((InpatientEpisodeForVTERiskAsessmentVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.pasevent != null)
			count++;
		if(this.admissiondatetime != null)
			count++;
		if(this.vteassessmentstatus != null)
			count++;
		if(this.vteriskassessment != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected ims.core.admin.pas.vo.PASEventRefVo pasevent;
	protected ims.framework.utils.DateTime admissiondatetime;
	protected ims.clinical.vo.lookups.VTEAsessmentStatus vteassessmentstatus;
	protected ims.core.clinical.vo.VTERiskAssessmentRefVo vteriskassessment;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
