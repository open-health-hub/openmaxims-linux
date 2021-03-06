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

package ims.scheduling.vo;

/**
 * Linked to Scheduling.Sch_Session business object (ID: 1055100010).
 */
public class SessionLocationVo extends ims.scheduling.vo.Sch_SessionRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public SessionLocationVo()
	{
	}
	public SessionLocationVo(Integer id, int version)
	{
		super(id, version);
	}
	public SessionLocationVo(ims.scheduling.vo.beans.SessionLocationVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.schlocation = bean.getSchLocation() == null ? null : bean.getSchLocation().buildVo();
		this.sessiondate = bean.getSessionDate() == null ? null : bean.getSessionDate().buildDate();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.beans.SessionLocationVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.schlocation = bean.getSchLocation() == null ? null : bean.getSchLocation().buildVo(map);
		this.sessiondate = bean.getSessionDate() == null ? null : bean.getSessionDate().buildDate();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.beans.SessionLocationVoBean bean = null;
		if(map != null)
			bean = (ims.scheduling.vo.beans.SessionLocationVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.scheduling.vo.beans.SessionLocationVoBean();
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
		if(fieldName.equals("SCHLOCATION"))
			return getSchLocation();
		if(fieldName.equals("SESSIONDATE"))
			return getSessionDate();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getSchLocationIsNotNull()
	{
		return this.schlocation != null;
	}
	public ims.core.vo.LocMostVo getSchLocation()
	{
		return this.schlocation;
	}
	public void setSchLocation(ims.core.vo.LocMostVo value)
	{
		this.isValidated = false;
		this.schlocation = value;
	}
	public boolean getSessionDateIsNotNull()
	{
		return this.sessiondate != null;
	}
	public ims.framework.utils.Date getSessionDate()
	{
		return this.sessiondate;
	}
	public void setSessionDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.sessiondate = value;
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
	
		SessionLocationVo clone = new SessionLocationVo(this.id, this.version);
		
		if(this.schlocation == null)
			clone.schlocation = null;
		else
			clone.schlocation = (ims.core.vo.LocMostVo)this.schlocation.clone();
		if(this.sessiondate == null)
			clone.sessiondate = null;
		else
			clone.sessiondate = (ims.framework.utils.Date)this.sessiondate.clone();
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
		if (!(SessionLocationVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A SessionLocationVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((SessionLocationVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((SessionLocationVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.schlocation != null)
			count++;
		if(this.sessiondate != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected ims.core.vo.LocMostVo schlocation;
	protected ims.framework.utils.Date sessiondate;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
