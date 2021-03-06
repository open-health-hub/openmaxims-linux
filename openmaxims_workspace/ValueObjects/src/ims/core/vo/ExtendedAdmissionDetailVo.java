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
 * Linked to core.admin.pas.ExtendedAdmissionDetail business object (ID: 1014100018).
 */
public class ExtendedAdmissionDetailVo extends ims.core.admin.pas.vo.ExtendedAdmissionDetailRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ExtendedAdmissionDetailVo()
	{
	}
	public ExtendedAdmissionDetailVo(Integer id, int version)
	{
		super(id, version);
	}
	public ExtendedAdmissionDetailVo(ims.core.vo.beans.ExtendedAdmissionDetailVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.referredfromtype = bean.getReferredFromType() == null ? null : ims.core.vo.lookups.ExternalResourceType.buildLookup(bean.getReferredFromType());
		this.referrerdetails = bean.getReferrerDetails() == null ? null : bean.getReferrerDetails().buildVo();
		this.admittedfromtype = bean.getAdmittedFromType() == null ? null : ims.core.vo.lookups.ExternalResourceType.buildLookup(bean.getAdmittedFromType());
		this.admittedfrom = bean.getAdmittedFrom() == null ? null : bean.getAdmittedFrom().buildVo();
		this.bednumber = bean.getBedNumber();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.ExtendedAdmissionDetailVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.referredfromtype = bean.getReferredFromType() == null ? null : ims.core.vo.lookups.ExternalResourceType.buildLookup(bean.getReferredFromType());
		this.referrerdetails = bean.getReferrerDetails() == null ? null : bean.getReferrerDetails().buildVo(map);
		this.admittedfromtype = bean.getAdmittedFromType() == null ? null : ims.core.vo.lookups.ExternalResourceType.buildLookup(bean.getAdmittedFromType());
		this.admittedfrom = bean.getAdmittedFrom() == null ? null : bean.getAdmittedFrom().buildVo(map);
		this.bednumber = bean.getBedNumber();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.ExtendedAdmissionDetailVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.ExtendedAdmissionDetailVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.ExtendedAdmissionDetailVoBean();
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
		if(fieldName.equals("REFERREDFROMTYPE"))
			return getReferredFromType();
		if(fieldName.equals("REFERRERDETAILS"))
			return getReferrerDetails();
		if(fieldName.equals("ADMITTEDFROMTYPE"))
			return getAdmittedFromType();
		if(fieldName.equals("ADMITTEDFROM"))
			return getAdmittedFrom();
		if(fieldName.equals("BEDNUMBER"))
			return getBedNumber();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getReferredFromTypeIsNotNull()
	{
		return this.referredfromtype != null;
	}
	public ims.core.vo.lookups.ExternalResourceType getReferredFromType()
	{
		return this.referredfromtype;
	}
	public void setReferredFromType(ims.core.vo.lookups.ExternalResourceType value)
	{
		this.isValidated = false;
		this.referredfromtype = value;
	}
	public boolean getReferrerDetailsIsNotNull()
	{
		return this.referrerdetails != null;
	}
	public ims.core.vo.ExternalResourceVo getReferrerDetails()
	{
		return this.referrerdetails;
	}
	public void setReferrerDetails(ims.core.vo.ExternalResourceVo value)
	{
		this.isValidated = false;
		this.referrerdetails = value;
	}
	public boolean getAdmittedFromTypeIsNotNull()
	{
		return this.admittedfromtype != null;
	}
	public ims.core.vo.lookups.ExternalResourceType getAdmittedFromType()
	{
		return this.admittedfromtype;
	}
	public void setAdmittedFromType(ims.core.vo.lookups.ExternalResourceType value)
	{
		this.isValidated = false;
		this.admittedfromtype = value;
	}
	public boolean getAdmittedFromIsNotNull()
	{
		return this.admittedfrom != null;
	}
	public ims.core.vo.ExternalResourceVo getAdmittedFrom()
	{
		return this.admittedfrom;
	}
	public void setAdmittedFrom(ims.core.vo.ExternalResourceVo value)
	{
		this.isValidated = false;
		this.admittedfrom = value;
	}
	public boolean getBedNumberIsNotNull()
	{
		return this.bednumber != null;
	}
	public Integer getBedNumber()
	{
		return this.bednumber;
	}
	public void setBedNumber(Integer value)
	{
		this.isValidated = false;
		this.bednumber = value;
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
		if(this.admittedfrom != null)
		{
			if(!this.admittedfrom.isValidated())
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
		if(this.admittedfrom != null)
		{
			String[] listOfOtherErrors = this.admittedfrom.validate();
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
	
		ExtendedAdmissionDetailVo clone = new ExtendedAdmissionDetailVo(this.id, this.version);
		
		if(this.referredfromtype == null)
			clone.referredfromtype = null;
		else
			clone.referredfromtype = (ims.core.vo.lookups.ExternalResourceType)this.referredfromtype.clone();
		if(this.referrerdetails == null)
			clone.referrerdetails = null;
		else
			clone.referrerdetails = (ims.core.vo.ExternalResourceVo)this.referrerdetails.clone();
		if(this.admittedfromtype == null)
			clone.admittedfromtype = null;
		else
			clone.admittedfromtype = (ims.core.vo.lookups.ExternalResourceType)this.admittedfromtype.clone();
		if(this.admittedfrom == null)
			clone.admittedfrom = null;
		else
			clone.admittedfrom = (ims.core.vo.ExternalResourceVo)this.admittedfrom.clone();
		clone.bednumber = this.bednumber;
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
		if (!(ExtendedAdmissionDetailVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ExtendedAdmissionDetailVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ExtendedAdmissionDetailVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ExtendedAdmissionDetailVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.referredfromtype != null)
			count++;
		if(this.referrerdetails != null)
			count++;
		if(this.admittedfromtype != null)
			count++;
		if(this.admittedfrom != null)
			count++;
		if(this.bednumber != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 5;
	}
	protected ims.core.vo.lookups.ExternalResourceType referredfromtype;
	protected ims.core.vo.ExternalResourceVo referrerdetails;
	protected ims.core.vo.lookups.ExternalResourceType admittedfromtype;
	protected ims.core.vo.ExternalResourceVo admittedfrom;
	protected Integer bednumber;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
