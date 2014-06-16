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
 * Linked to therapies.treatment.SportsActivity business object (ID: 1019100054).
 */
public class SportsActivityVo extends ims.therapies.treatment.vo.SportsActivityRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public SportsActivityVo()
	{
	}
	public SportsActivityVo(Integer id, int version)
	{
		super(id, version);
	}
	public SportsActivityVo(ims.therapies.vo.beans.SportsActivityVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.sportsactivity = bean.getSportsActivity() == null ? null : ims.spinalinjuries.vo.lookups.SportActivity.buildLookup(bean.getSportsActivity());
		this.select = bean.getSelect() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getSelect());
		this.comments = bean.getComments();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.therapies.vo.beans.SportsActivityVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.sportsactivity = bean.getSportsActivity() == null ? null : ims.spinalinjuries.vo.lookups.SportActivity.buildLookup(bean.getSportsActivity());
		this.select = bean.getSelect() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getSelect());
		this.comments = bean.getComments();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.therapies.vo.beans.SportsActivityVoBean bean = null;
		if(map != null)
			bean = (ims.therapies.vo.beans.SportsActivityVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.therapies.vo.beans.SportsActivityVoBean();
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
		if(fieldName.equals("SPORTSACTIVITY"))
			return getSportsActivity();
		if(fieldName.equals("SELECT"))
			return getSelect();
		if(fieldName.equals("COMMENTS"))
			return getComments();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getSportsActivityIsNotNull()
	{
		return this.sportsactivity != null;
	}
	public ims.spinalinjuries.vo.lookups.SportActivity getSportsActivity()
	{
		return this.sportsactivity;
	}
	public void setSportsActivity(ims.spinalinjuries.vo.lookups.SportActivity value)
	{
		this.isValidated = false;
		this.sportsactivity = value;
	}
	public boolean getSelectIsNotNull()
	{
		return this.select != null;
	}
	public ims.core.vo.lookups.YesNo getSelect()
	{
		return this.select;
	}
	public void setSelect(ims.core.vo.lookups.YesNo value)
	{
		this.isValidated = false;
		this.select = value;
	}
	public boolean getCommentsIsNotNull()
	{
		return this.comments != null;
	}
	public String getComments()
	{
		return this.comments;
	}
	public static int getCommentsMaxLength()
	{
		return 255;
	}
	public void setComments(String value)
	{
		this.isValidated = false;
		this.comments = value;
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
		if(this.sportsactivity == null)
			listOfErrors.add("SportsActivity is mandatory");
		if(this.comments != null)
			if(this.comments.length() > 255)
				listOfErrors.add("The length of the field [comments] in the value object [ims.therapies.vo.SportsActivityVo] is too big. It should be less or equal to 255");
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
	
		SportsActivityVo clone = new SportsActivityVo(this.id, this.version);
		
		if(this.sportsactivity == null)
			clone.sportsactivity = null;
		else
			clone.sportsactivity = (ims.spinalinjuries.vo.lookups.SportActivity)this.sportsactivity.clone();
		if(this.select == null)
			clone.select = null;
		else
			clone.select = (ims.core.vo.lookups.YesNo)this.select.clone();
		clone.comments = this.comments;
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
		if (!(SportsActivityVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A SportsActivityVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((SportsActivityVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((SportsActivityVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.sportsactivity != null)
			count++;
		if(this.select != null)
			count++;
		if(this.comments != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected ims.spinalinjuries.vo.lookups.SportActivity sportsactivity;
	protected ims.core.vo.lookups.YesNo select;
	protected String comments;
	private boolean isValidated = false;
	private boolean isBusy = false;
}