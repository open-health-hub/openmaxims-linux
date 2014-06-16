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

package ims.core.vo;

/**
 * Linked to core.admin.pas.BedSpaceState business object (ID: 1014100009).
 */
public class BedSpaceStateLiteVo extends ims.core.admin.pas.vo.BedSpaceStateRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public BedSpaceStateLiteVo()
	{
	}
	public BedSpaceStateLiteVo(Integer id, int version)
	{
		super(id, version);
	}
	public BedSpaceStateLiteVo(ims.core.vo.beans.BedSpaceStateLiteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.currentbedstatus = bean.getCurrentBedStatus() == null ? null : bean.getCurrentBedStatus().buildVo();
		this.ismaternity = bean.getIsMaternity();
		this.noofinfants = bean.getNoOfInfants();
		this.bedspace = bean.getBedSpace() == null ? null : bean.getBedSpace().buildVo();
		this.ward = bean.getWard() == null ? null : bean.getWard().buildVo();
		this.inpatientepisode = bean.getInpatientEpisode() == null ? null : bean.getInpatientEpisode().buildVo();
		this.previousbedstatus = bean.getPreviousBedStatus() == null ? null : bean.getPreviousBedStatus().buildVo();
		this.comment = bean.getComment();
		this.bay = bean.getBay() == null ? null : bean.getBay().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.BedSpaceStateLiteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.currentbedstatus = bean.getCurrentBedStatus() == null ? null : bean.getCurrentBedStatus().buildVo(map);
		this.ismaternity = bean.getIsMaternity();
		this.noofinfants = bean.getNoOfInfants();
		this.bedspace = bean.getBedSpace() == null ? null : bean.getBedSpace().buildVo(map);
		this.ward = bean.getWard() == null ? null : bean.getWard().buildVo(map);
		this.inpatientepisode = bean.getInpatientEpisode() == null ? null : bean.getInpatientEpisode().buildVo(map);
		this.previousbedstatus = bean.getPreviousBedStatus() == null ? null : bean.getPreviousBedStatus().buildVo(map);
		this.comment = bean.getComment();
		this.bay = bean.getBay() == null ? null : bean.getBay().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.BedSpaceStateLiteVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.BedSpaceStateLiteVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.BedSpaceStateLiteVoBean();
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
		if(fieldName.equals("CURRENTBEDSTATUS"))
			return getCurrentBedStatus();
		if(fieldName.equals("ISMATERNITY"))
			return getIsMaternity();
		if(fieldName.equals("NOOFINFANTS"))
			return getNoOfInfants();
		if(fieldName.equals("BEDSPACE"))
			return getBedSpace();
		if(fieldName.equals("WARD"))
			return getWard();
		if(fieldName.equals("INPATIENTEPISODE"))
			return getInpatientEpisode();
		if(fieldName.equals("PREVIOUSBEDSTATUS"))
			return getPreviousBedStatus();
		if(fieldName.equals("COMMENT"))
			return getComment();
		if(fieldName.equals("BAY"))
			return getBay();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getCurrentBedStatusIsNotNull()
	{
		return this.currentbedstatus != null;
	}
	public ims.core.vo.BedSpaceStateStatusLiteVo getCurrentBedStatus()
	{
		return this.currentbedstatus;
	}
	public void setCurrentBedStatus(ims.core.vo.BedSpaceStateStatusLiteVo value)
	{
		this.isValidated = false;
		this.currentbedstatus = value;
	}
	public boolean getIsMaternityIsNotNull()
	{
		return this.ismaternity != null;
	}
	public Boolean getIsMaternity()
	{
		return this.ismaternity;
	}
	public void setIsMaternity(Boolean value)
	{
		this.isValidated = false;
		this.ismaternity = value;
	}
	public boolean getNoOfInfantsIsNotNull()
	{
		return this.noofinfants != null;
	}
	public Integer getNoOfInfants()
	{
		return this.noofinfants;
	}
	public void setNoOfInfants(Integer value)
	{
		this.isValidated = false;
		this.noofinfants = value;
	}
	public boolean getBedSpaceIsNotNull()
	{
		return this.bedspace != null;
	}
	public ims.core.vo.BedSpaceVo getBedSpace()
	{
		return this.bedspace;
	}
	public void setBedSpace(ims.core.vo.BedSpaceVo value)
	{
		this.isValidated = false;
		this.bedspace = value;
	}
	public boolean getWardIsNotNull()
	{
		return this.ward != null;
	}
	public ims.core.vo.LocationLiteVo getWard()
	{
		return this.ward;
	}
	public void setWard(ims.core.vo.LocationLiteVo value)
	{
		this.isValidated = false;
		this.ward = value;
	}
	public boolean getInpatientEpisodeIsNotNull()
	{
		return this.inpatientepisode != null;
	}
	public ims.core.vo.InpatientEpisodeLiteVo getInpatientEpisode()
	{
		return this.inpatientepisode;
	}
	public void setInpatientEpisode(ims.core.vo.InpatientEpisodeLiteVo value)
	{
		this.isValidated = false;
		this.inpatientepisode = value;
	}
	public boolean getPreviousBedStatusIsNotNull()
	{
		return this.previousbedstatus != null;
	}
	public ims.core.vo.BedSpaceStateStatusLiteVo getPreviousBedStatus()
	{
		return this.previousbedstatus;
	}
	public void setPreviousBedStatus(ims.core.vo.BedSpaceStateStatusLiteVo value)
	{
		this.isValidated = false;
		this.previousbedstatus = value;
	}
	public boolean getCommentIsNotNull()
	{
		return this.comment != null;
	}
	public String getComment()
	{
		return this.comment;
	}
	public static int getCommentMaxLength()
	{
		return 1500;
	}
	public void setComment(String value)
	{
		this.isValidated = false;
		this.comment = value;
	}
	public boolean getBayIsNotNull()
	{
		return this.bay != null;
	}
	public ims.core.vo.LocationLiteVo getBay()
	{
		return this.bay;
	}
	public void setBay(ims.core.vo.LocationLiteVo value)
	{
		this.isValidated = false;
		this.bay = value;
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
		if(this.currentbedstatus != null)
		{
			if(!this.currentbedstatus.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.bedspace != null)
		{
			if(!this.bedspace.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.ward != null)
		{
			if(!this.ward.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.previousbedstatus != null)
		{
			if(!this.previousbedstatus.isValidated())
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
		if(this.currentbedstatus != null)
		{
			String[] listOfOtherErrors = this.currentbedstatus.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.bedspace != null)
		{
			String[] listOfOtherErrors = this.bedspace.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.ward != null)
		{
			String[] listOfOtherErrors = this.ward.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.previousbedstatus != null)
		{
			String[] listOfOtherErrors = this.previousbedstatus.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.comment != null)
			if(this.comment.length() > 1500)
				listOfErrors.add("The length of the field [comment] in the value object [ims.core.vo.BedSpaceStateLiteVo] is too big. It should be less or equal to 1500");
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
	
		BedSpaceStateLiteVo clone = new BedSpaceStateLiteVo(this.id, this.version);
		
		if(this.currentbedstatus == null)
			clone.currentbedstatus = null;
		else
			clone.currentbedstatus = (ims.core.vo.BedSpaceStateStatusLiteVo)this.currentbedstatus.clone();
		clone.ismaternity = this.ismaternity;
		clone.noofinfants = this.noofinfants;
		if(this.bedspace == null)
			clone.bedspace = null;
		else
			clone.bedspace = (ims.core.vo.BedSpaceVo)this.bedspace.clone();
		if(this.ward == null)
			clone.ward = null;
		else
			clone.ward = (ims.core.vo.LocationLiteVo)this.ward.clone();
		if(this.inpatientepisode == null)
			clone.inpatientepisode = null;
		else
			clone.inpatientepisode = (ims.core.vo.InpatientEpisodeLiteVo)this.inpatientepisode.clone();
		if(this.previousbedstatus == null)
			clone.previousbedstatus = null;
		else
			clone.previousbedstatus = (ims.core.vo.BedSpaceStateStatusLiteVo)this.previousbedstatus.clone();
		clone.comment = this.comment;
		if(this.bay == null)
			clone.bay = null;
		else
			clone.bay = (ims.core.vo.LocationLiteVo)this.bay.clone();
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
		if (!(BedSpaceStateLiteVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A BedSpaceStateLiteVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((BedSpaceStateLiteVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((BedSpaceStateLiteVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.currentbedstatus != null)
			count++;
		if(this.ismaternity != null)
			count++;
		if(this.noofinfants != null)
			count++;
		if(this.bedspace != null)
			count++;
		if(this.ward != null)
			count++;
		if(this.inpatientepisode != null)
			count++;
		if(this.previousbedstatus != null)
			count++;
		if(this.comment != null)
			count++;
		if(this.bay != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 9;
	}
	protected ims.core.vo.BedSpaceStateStatusLiteVo currentbedstatus;
	protected Boolean ismaternity;
	protected Integer noofinfants;
	protected ims.core.vo.BedSpaceVo bedspace;
	protected ims.core.vo.LocationLiteVo ward;
	protected ims.core.vo.InpatientEpisodeLiteVo inpatientepisode;
	protected ims.core.vo.BedSpaceStateStatusLiteVo previousbedstatus;
	protected String comment;
	protected ims.core.vo.LocationLiteVo bay;
	private boolean isValidated = false;
	private boolean isBusy = false;
}