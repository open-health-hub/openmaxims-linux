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

package ims.therapies.vo;

/**
 * Linked to therapies.treatment.RemedialActivity business object (ID: 1019100010).
 */
public class RemedialActivityVo extends ims.therapies.treatment.vo.RemedialActivityRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public RemedialActivityVo()
	{
	}
	public RemedialActivityVo(Integer id, int version)
	{
		super(id, version);
	}
	public RemedialActivityVo(ims.therapies.vo.beans.RemedialActivityVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.activity = bean.getActivity() == null ? null : ims.spinalinjuries.vo.lookups.RemedialActivity.buildLookup(bean.getActivity());
		this.patientposition = bean.getPatientPosition() == null ? null : ims.spinalinjuries.vo.lookups.RemedialPatPosition.buildLookup(bean.getPatientPosition());
		this.activityposition = bean.getActivityPosition() == null ? null : ims.spinalinjuries.vo.lookups.RemedialActPosition.buildLookup(bean.getActivityPosition());
		this.sequence = bean.getSequence() == null ? null : ims.spinalinjuries.vo.lookups.RemedialSequence.buildLookup(bean.getSequence());
		this.duration = bean.getDuration();
		this.activityheight = bean.getActivityHeight();
		this.numberpauses = bean.getNumberPauses();
		this.restperiod = bean.getRestPeriod();
		this.averagepause = bean.getAveragePause();
		this.independence = bean.getIndependence() == null ? null : ims.spinalinjuries.vo.lookups.RemedialIndependence.buildLookup(bean.getIndependence());
		this.subjectiveobs = bean.getSubjectiveObs() == null ? null : ims.spinalinjuries.vo.lookups.RemedialSubjectiveObs.buildLookup(bean.getSubjectiveObs());
		this.technique = ims.spinalinjuries.vo.lookups.RemedialTechniqueCollection.buildFromBeanCollection(bean.getTechnique());
		this.material = ims.therapies.vo.RemedialMaterialVoCollection.buildFromBeanCollection(bean.getMaterial());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.therapies.vo.beans.RemedialActivityVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.activity = bean.getActivity() == null ? null : ims.spinalinjuries.vo.lookups.RemedialActivity.buildLookup(bean.getActivity());
		this.patientposition = bean.getPatientPosition() == null ? null : ims.spinalinjuries.vo.lookups.RemedialPatPosition.buildLookup(bean.getPatientPosition());
		this.activityposition = bean.getActivityPosition() == null ? null : ims.spinalinjuries.vo.lookups.RemedialActPosition.buildLookup(bean.getActivityPosition());
		this.sequence = bean.getSequence() == null ? null : ims.spinalinjuries.vo.lookups.RemedialSequence.buildLookup(bean.getSequence());
		this.duration = bean.getDuration();
		this.activityheight = bean.getActivityHeight();
		this.numberpauses = bean.getNumberPauses();
		this.restperiod = bean.getRestPeriod();
		this.averagepause = bean.getAveragePause();
		this.independence = bean.getIndependence() == null ? null : ims.spinalinjuries.vo.lookups.RemedialIndependence.buildLookup(bean.getIndependence());
		this.subjectiveobs = bean.getSubjectiveObs() == null ? null : ims.spinalinjuries.vo.lookups.RemedialSubjectiveObs.buildLookup(bean.getSubjectiveObs());
		this.technique = ims.spinalinjuries.vo.lookups.RemedialTechniqueCollection.buildFromBeanCollection(bean.getTechnique());
		this.material = ims.therapies.vo.RemedialMaterialVoCollection.buildFromBeanCollection(bean.getMaterial());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.therapies.vo.beans.RemedialActivityVoBean bean = null;
		if(map != null)
			bean = (ims.therapies.vo.beans.RemedialActivityVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.therapies.vo.beans.RemedialActivityVoBean();
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
		if(fieldName.equals("ACTIVITY"))
			return getActivity();
		if(fieldName.equals("PATIENTPOSITION"))
			return getPatientPosition();
		if(fieldName.equals("ACTIVITYPOSITION"))
			return getActivityPosition();
		if(fieldName.equals("SEQUENCE"))
			return getSequence();
		if(fieldName.equals("DURATION"))
			return getDuration();
		if(fieldName.equals("ACTIVITYHEIGHT"))
			return getActivityHeight();
		if(fieldName.equals("NUMBERPAUSES"))
			return getNumberPauses();
		if(fieldName.equals("RESTPERIOD"))
			return getRestPeriod();
		if(fieldName.equals("AVERAGEPAUSE"))
			return getAveragePause();
		if(fieldName.equals("INDEPENDENCE"))
			return getIndependence();
		if(fieldName.equals("SUBJECTIVEOBS"))
			return getSubjectiveObs();
		if(fieldName.equals("TECHNIQUE"))
			return getTechnique();
		if(fieldName.equals("MATERIAL"))
			return getMaterial();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getActivityIsNotNull()
	{
		return this.activity != null;
	}
	public ims.spinalinjuries.vo.lookups.RemedialActivity getActivity()
	{
		return this.activity;
	}
	public void setActivity(ims.spinalinjuries.vo.lookups.RemedialActivity value)
	{
		this.isValidated = false;
		this.activity = value;
	}
	public boolean getPatientPositionIsNotNull()
	{
		return this.patientposition != null;
	}
	public ims.spinalinjuries.vo.lookups.RemedialPatPosition getPatientPosition()
	{
		return this.patientposition;
	}
	public void setPatientPosition(ims.spinalinjuries.vo.lookups.RemedialPatPosition value)
	{
		this.isValidated = false;
		this.patientposition = value;
	}
	public boolean getActivityPositionIsNotNull()
	{
		return this.activityposition != null;
	}
	public ims.spinalinjuries.vo.lookups.RemedialActPosition getActivityPosition()
	{
		return this.activityposition;
	}
	public void setActivityPosition(ims.spinalinjuries.vo.lookups.RemedialActPosition value)
	{
		this.isValidated = false;
		this.activityposition = value;
	}
	public boolean getSequenceIsNotNull()
	{
		return this.sequence != null;
	}
	public ims.spinalinjuries.vo.lookups.RemedialSequence getSequence()
	{
		return this.sequence;
	}
	public void setSequence(ims.spinalinjuries.vo.lookups.RemedialSequence value)
	{
		this.isValidated = false;
		this.sequence = value;
	}
	public boolean getDurationIsNotNull()
	{
		return this.duration != null;
	}
	public Integer getDuration()
	{
		return this.duration;
	}
	public void setDuration(Integer value)
	{
		this.isValidated = false;
		this.duration = value;
	}
	public boolean getActivityHeightIsNotNull()
	{
		return this.activityheight != null;
	}
	public Integer getActivityHeight()
	{
		return this.activityheight;
	}
	public void setActivityHeight(Integer value)
	{
		this.isValidated = false;
		this.activityheight = value;
	}
	public boolean getNumberPausesIsNotNull()
	{
		return this.numberpauses != null;
	}
	public String getNumberPauses()
	{
		return this.numberpauses;
	}
	public static int getNumberPausesMaxLength()
	{
		return 30;
	}
	public void setNumberPauses(String value)
	{
		this.isValidated = false;
		this.numberpauses = value;
	}
	public boolean getRestPeriodIsNotNull()
	{
		return this.restperiod != null;
	}
	public Integer getRestPeriod()
	{
		return this.restperiod;
	}
	public void setRestPeriod(Integer value)
	{
		this.isValidated = false;
		this.restperiod = value;
	}
	public boolean getAveragePauseIsNotNull()
	{
		return this.averagepause != null;
	}
	public Integer getAveragePause()
	{
		return this.averagepause;
	}
	public void setAveragePause(Integer value)
	{
		this.isValidated = false;
		this.averagepause = value;
	}
	public boolean getIndependenceIsNotNull()
	{
		return this.independence != null;
	}
	public ims.spinalinjuries.vo.lookups.RemedialIndependence getIndependence()
	{
		return this.independence;
	}
	public void setIndependence(ims.spinalinjuries.vo.lookups.RemedialIndependence value)
	{
		this.isValidated = false;
		this.independence = value;
	}
	public boolean getSubjectiveObsIsNotNull()
	{
		return this.subjectiveobs != null;
	}
	public ims.spinalinjuries.vo.lookups.RemedialSubjectiveObs getSubjectiveObs()
	{
		return this.subjectiveobs;
	}
	public void setSubjectiveObs(ims.spinalinjuries.vo.lookups.RemedialSubjectiveObs value)
	{
		this.isValidated = false;
		this.subjectiveobs = value;
	}
	public boolean getTechniqueIsNotNull()
	{
		return this.technique != null;
	}
	public ims.spinalinjuries.vo.lookups.RemedialTechniqueCollection getTechnique()
	{
		return this.technique;
	}
	public void setTechnique(ims.spinalinjuries.vo.lookups.RemedialTechniqueCollection value)
	{
		this.isValidated = false;
		this.technique = value;
	}
	public boolean getMaterialIsNotNull()
	{
		return this.material != null;
	}
	public ims.therapies.vo.RemedialMaterialVoCollection getMaterial()
	{
		return this.material;
	}
	public void setMaterial(ims.therapies.vo.RemedialMaterialVoCollection value)
	{
		this.isValidated = false;
		this.material = value;
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
		if(this.material != null)
		{
			if(!this.material.isValidated())
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
		if(this.activity == null)
			listOfErrors.add("Activity is mandatory");
		if(this.numberpauses != null)
			if(this.numberpauses.length() > 30)
				listOfErrors.add("The length of the field [numberpauses] in the value object [ims.therapies.vo.RemedialActivityVo] is too big. It should be less or equal to 30");
		if(this.material != null)
		{
			String[] listOfOtherErrors = this.material.validate();
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
	
		RemedialActivityVo clone = new RemedialActivityVo(this.id, this.version);
		
		if(this.activity == null)
			clone.activity = null;
		else
			clone.activity = (ims.spinalinjuries.vo.lookups.RemedialActivity)this.activity.clone();
		if(this.patientposition == null)
			clone.patientposition = null;
		else
			clone.patientposition = (ims.spinalinjuries.vo.lookups.RemedialPatPosition)this.patientposition.clone();
		if(this.activityposition == null)
			clone.activityposition = null;
		else
			clone.activityposition = (ims.spinalinjuries.vo.lookups.RemedialActPosition)this.activityposition.clone();
		if(this.sequence == null)
			clone.sequence = null;
		else
			clone.sequence = (ims.spinalinjuries.vo.lookups.RemedialSequence)this.sequence.clone();
		clone.duration = this.duration;
		clone.activityheight = this.activityheight;
		clone.numberpauses = this.numberpauses;
		clone.restperiod = this.restperiod;
		clone.averagepause = this.averagepause;
		if(this.independence == null)
			clone.independence = null;
		else
			clone.independence = (ims.spinalinjuries.vo.lookups.RemedialIndependence)this.independence.clone();
		if(this.subjectiveobs == null)
			clone.subjectiveobs = null;
		else
			clone.subjectiveobs = (ims.spinalinjuries.vo.lookups.RemedialSubjectiveObs)this.subjectiveobs.clone();
		if(this.technique == null)
			clone.technique = null;
		else
			clone.technique = (ims.spinalinjuries.vo.lookups.RemedialTechniqueCollection)this.technique.clone();
		if(this.material == null)
			clone.material = null;
		else
			clone.material = (ims.therapies.vo.RemedialMaterialVoCollection)this.material.clone();
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
		if (!(RemedialActivityVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A RemedialActivityVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		RemedialActivityVo compareObj = (RemedialActivityVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getID_RemedialActivity() == null && compareObj.getID_RemedialActivity() != null)
				return -1;
			if(this.getID_RemedialActivity() != null && compareObj.getID_RemedialActivity() == null)
				return 1;
			if(this.getID_RemedialActivity() != null && compareObj.getID_RemedialActivity() != null)
				retVal = this.getID_RemedialActivity().compareTo(compareObj.getID_RemedialActivity());
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
		if(this.activity != null)
			count++;
		if(this.patientposition != null)
			count++;
		if(this.activityposition != null)
			count++;
		if(this.sequence != null)
			count++;
		if(this.duration != null)
			count++;
		if(this.activityheight != null)
			count++;
		if(this.numberpauses != null)
			count++;
		if(this.restperiod != null)
			count++;
		if(this.averagepause != null)
			count++;
		if(this.independence != null)
			count++;
		if(this.subjectiveobs != null)
			count++;
		if(this.technique != null)
			count++;
		if(this.material != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 13;
	}
	protected ims.spinalinjuries.vo.lookups.RemedialActivity activity;
	protected ims.spinalinjuries.vo.lookups.RemedialPatPosition patientposition;
	protected ims.spinalinjuries.vo.lookups.RemedialActPosition activityposition;
	protected ims.spinalinjuries.vo.lookups.RemedialSequence sequence;
	protected Integer duration;
	protected Integer activityheight;
	protected String numberpauses;
	protected Integer restperiod;
	protected Integer averagepause;
	protected ims.spinalinjuries.vo.lookups.RemedialIndependence independence;
	protected ims.spinalinjuries.vo.lookups.RemedialSubjectiveObs subjectiveobs;
	protected ims.spinalinjuries.vo.lookups.RemedialTechniqueCollection technique;
	protected ims.therapies.vo.RemedialMaterialVoCollection material;
	private boolean isValidated = false;
	private boolean isBusy = false;
}