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
 * Linked to clinical.MedicationOverview business object (ID: 1072100034).
 */
public class MedicationOverViewVo extends ims.clinical.vo.MedicationOverViewLiteVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public MedicationOverViewVo()
	{
	}
	public MedicationOverViewVo(Integer id, int version)
	{
		super(id, version);
	}
	public MedicationOverViewVo(ims.clinical.vo.beans.MedicationOverViewVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.type = bean.getType() == null ? null : ims.clinical.vo.lookups.MedicationSnapShot.buildLookup(bean.getType());
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo();
		this.medication = ims.core.vo.PatientMedicationVoCollection.buildFromBeanCollection(bean.getMedication());
		this.correctness = bean.getCorrectness() == null ? null : ims.core.vo.lookups.MedOverviewCorrectness.buildLookup(bean.getCorrectness());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.MedicationOverViewVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.type = bean.getType() == null ? null : ims.clinical.vo.lookups.MedicationSnapShot.buildLookup(bean.getType());
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo(map);
		this.medication = ims.core.vo.PatientMedicationVoCollection.buildFromBeanCollection(bean.getMedication());
		this.correctness = bean.getCorrectness() == null ? null : ims.core.vo.lookups.MedOverviewCorrectness.buildLookup(bean.getCorrectness());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.MedicationOverViewVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.MedicationOverViewVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.MedicationOverViewVoBean();
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
		if(fieldName.equals("MEDICATION"))
			return getMedication();
		if(fieldName.equals("CORRECTNESS"))
			return getCorrectness();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getMedicationIsNotNull()
	{
		return this.medication != null;
	}
	public ims.core.vo.PatientMedicationVoCollection getMedication()
	{
		return this.medication;
	}
	public void setMedication(ims.core.vo.PatientMedicationVoCollection value)
	{
		this.isValidated = false;
		this.medication = value;
	}
	public boolean getCorrectnessIsNotNull()
	{
		return this.correctness != null;
	}
	public ims.core.vo.lookups.MedOverviewCorrectness getCorrectness()
	{
		return this.correctness;
	}
	public void setCorrectness(ims.core.vo.lookups.MedOverviewCorrectness value)
	{
		this.isValidated = false;
		this.correctness = value;
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
		if(this.authoringinformation != null)
		{
			if(!this.authoringinformation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.medication != null)
		{
			if(!this.medication.isValidated())
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
		if(this.authoringinformation == null)
			listOfErrors.add("Authoring Information is mandatory");
		if(this.authoringinformation != null)
		{
			String[] listOfOtherErrors = this.authoringinformation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.medication != null)
		{
			String[] listOfOtherErrors = this.medication.validate();
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
	
		MedicationOverViewVo clone = new MedicationOverViewVo(this.id, this.version);
		
		if(this.type == null)
			clone.type = null;
		else
			clone.type = (ims.clinical.vo.lookups.MedicationSnapShot)this.type.clone();
		clone.carecontext = this.carecontext;
		if(this.authoringinformation == null)
			clone.authoringinformation = null;
		else
			clone.authoringinformation = (ims.core.vo.AuthoringInformationVo)this.authoringinformation.clone();
		if(this.medication == null)
			clone.medication = null;
		else
			clone.medication = (ims.core.vo.PatientMedicationVoCollection)this.medication.clone();
		if(this.correctness == null)
			clone.correctness = null;
		else
			clone.correctness = (ims.core.vo.lookups.MedOverviewCorrectness)this.correctness.clone();
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
		if (!(MedicationOverViewVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A MedicationOverViewVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((MedicationOverViewVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((MedicationOverViewVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = super.countFieldsWithValue();
		if(this.medication != null)
			count++;
		if(this.correctness != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 2;
	}
	protected ims.core.vo.PatientMedicationVoCollection medication;
	protected ims.core.vo.lookups.MedOverviewCorrectness correctness;
	private boolean isValidated = false;
	private boolean isBusy = false;
}