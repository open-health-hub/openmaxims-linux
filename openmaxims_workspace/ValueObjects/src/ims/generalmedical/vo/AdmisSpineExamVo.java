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

package ims.generalmedical.vo;


public class AdmisSpineExamVo extends ims.vo.ValueObject implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public AdmisSpineExamVo()
	{
	}
	public AdmisSpineExamVo(ims.generalmedical.vo.beans.AdmisSpineExamVoBean bean)
	{
		this.mskexam = bean.getMskExam() == null ? null : bean.getMskExam().buildVo();
		this.problemsonadmission = ims.generalmedical.vo.MedicalProbOnAdmisVoCollection.buildFromBeanCollection(bean.getProblemsOnAdmission());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.generalmedical.vo.beans.AdmisSpineExamVoBean bean)
	{
		this.mskexam = bean.getMskExam() == null ? null : bean.getMskExam().buildVo(map);
		this.problemsonadmission = ims.generalmedical.vo.MedicalProbOnAdmisVoCollection.buildFromBeanCollection(bean.getProblemsOnAdmission());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.generalmedical.vo.beans.AdmisSpineExamVoBean bean = null;
		if(map != null)
			bean = (ims.generalmedical.vo.beans.AdmisSpineExamVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.generalmedical.vo.beans.AdmisSpineExamVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean getMskExamIsNotNull()
	{
		return this.mskexam != null;
	}
	public ims.generalmedical.vo.MskSpineExaminationVo getMskExam()
	{
		return this.mskexam;
	}
	public void setMskExam(ims.generalmedical.vo.MskSpineExaminationVo value)
	{
		this.isValidated = false;
		this.mskexam = value;
	}
	public boolean getProblemsOnAdmissionIsNotNull()
	{
		return this.problemsonadmission != null;
	}
	public ims.generalmedical.vo.MedicalProbOnAdmisVoCollection getProblemsOnAdmission()
	{
		return this.problemsonadmission;
	}
	public void setProblemsOnAdmission(ims.generalmedical.vo.MedicalProbOnAdmisVoCollection value)
	{
		this.isValidated = false;
		this.problemsonadmission = value;
	}
	public final String getIItemText()
	{
		return toString();
	}
	public final Integer getBoId() 
	{
		return null;
	}
	public final String getBoClassName()
	{
		return null;
	}
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(!(obj instanceof AdmisSpineExamVo))
			return false;
		AdmisSpineExamVo compareObj = (AdmisSpineExamVo)obj;
		if(this.getMskExam() == null && compareObj.getMskExam() != null)
			return false;
		if(this.getMskExam() != null && compareObj.getMskExam() == null)
			return false;
		if(this.getMskExam() != null && compareObj.getMskExam() != null)
			return this.getMskExam().equals(compareObj.getMskExam());
		return super.equals(obj);
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
		if(this.mskexam != null)
		{
			if(!this.mskexam.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.problemsonadmission != null)
		{
			if(!this.problemsonadmission.isValidated())
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
		if(this.mskexam != null)
		{
			String[] listOfOtherErrors = this.mskexam.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.problemsonadmission != null)
		{
			String[] listOfOtherErrors = this.problemsonadmission.validate();
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
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		AdmisSpineExamVo clone = new AdmisSpineExamVo();
		
		if(this.mskexam == null)
			clone.mskexam = null;
		else
			clone.mskexam = (ims.generalmedical.vo.MskSpineExaminationVo)this.mskexam.clone();
		if(this.problemsonadmission == null)
			clone.problemsonadmission = null;
		else
			clone.problemsonadmission = (ims.generalmedical.vo.MedicalProbOnAdmisVoCollection)this.problemsonadmission.clone();
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
		if (!(AdmisSpineExamVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A AdmisSpineExamVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		AdmisSpineExamVo compareObj = (AdmisSpineExamVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getMskExam() == null && compareObj.getMskExam() != null)
				return -1;
			if(this.getMskExam() != null && compareObj.getMskExam() == null)
				return 1;
			if(this.getMskExam() != null && compareObj.getMskExam() != null)
				retVal = this.getMskExam().compareTo(compareObj.getMskExam());
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
		if(this.mskexam != null)
			count++;
		if(this.problemsonadmission != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected ims.generalmedical.vo.MskSpineExaminationVo mskexam;
	protected ims.generalmedical.vo.MedicalProbOnAdmisVoCollection problemsonadmission;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
