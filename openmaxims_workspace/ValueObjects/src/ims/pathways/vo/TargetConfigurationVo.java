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
 * Linked to Pathways.Configuration.Target business object (ID: 1089100001).
 */
public class TargetConfigurationVo extends ims.pathways.vo.TargetConfigurationShortVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public TargetConfigurationVo()
	{
	}
	public TargetConfigurationVo(Integer id, int version)
	{
		super(id, version);
	}
	public TargetConfigurationVo(ims.pathways.vo.beans.TargetConfigurationVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.name = bean.getName();
		this.description = bean.getDescription();
		this.eventlinktype = bean.getEventLinkType() == null ? null : ims.pathways.vo.lookups.EventLinkType.buildLookup(bean.getEventLinkType());
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getStatus());
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
		this.targetdatecalculation = bean.getTargetDateCalculation() == null ? null : ims.pathways.vo.lookups.TargetDateCalculation.buildLookup(bean.getTargetDateCalculation());
		this.taxonomymaps = ims.core.vo.TaxonomyMapCollection.buildFromBeanCollection(bean.getTaxonomyMaps());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.pathways.vo.beans.TargetConfigurationVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.name = bean.getName();
		this.description = bean.getDescription();
		this.eventlinktype = bean.getEventLinkType() == null ? null : ims.pathways.vo.lookups.EventLinkType.buildLookup(bean.getEventLinkType());
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getStatus());
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
		this.targetdatecalculation = bean.getTargetDateCalculation() == null ? null : ims.pathways.vo.lookups.TargetDateCalculation.buildLookup(bean.getTargetDateCalculation());
		this.taxonomymaps = ims.core.vo.TaxonomyMapCollection.buildFromBeanCollection(bean.getTaxonomyMaps());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.pathways.vo.beans.TargetConfigurationVoBean bean = null;
		if(map != null)
			bean = (ims.pathways.vo.beans.TargetConfigurationVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.pathways.vo.beans.TargetConfigurationVoBean();
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
		if(fieldName.equals("TAXONOMYMAPS"))
			return getTaxonomyMaps();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getTaxonomyMapsIsNotNull()
	{
		return this.taxonomymaps != null;
	}
	public ims.core.vo.TaxonomyMapCollection getTaxonomyMaps()
	{
		return this.taxonomymaps;
	}
	public void setTaxonomyMaps(ims.core.vo.TaxonomyMapCollection value)
	{
		this.isValidated = false;
		this.taxonomymaps = value;
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
		if(this.taxonomymaps != null)
		{
			if(!this.taxonomymaps.isValidated())
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
		if(this.name == null || this.name.length() == 0)
			listOfErrors.add("Name is mandatory");
		else if(this.name.length() > 255)
			listOfErrors.add("The length of the field [name] in the value object [ims.pathways.vo.TargetConfigurationVo] is too big. It should be less or equal to 255");
		if(this.description != null)
			if(this.description.length() > 255)
				listOfErrors.add("The length of the field [description] in the value object [ims.pathways.vo.TargetConfigurationVo] is too big. It should be less or equal to 255");
		if(this.eventlinktype == null)
			listOfErrors.add("EventLinkType is mandatory");
		if(this.status == null)
			listOfErrors.add("Status is mandatory");
		if(this.taxonomymaps != null)
		{
			String[] listOfOtherErrors = this.taxonomymaps.validate();
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
	
		TargetConfigurationVo clone = new TargetConfigurationVo(this.id, this.version);
		
		clone.name = this.name;
		clone.description = this.description;
		if(this.eventlinktype == null)
			clone.eventlinktype = null;
		else
			clone.eventlinktype = (ims.pathways.vo.lookups.EventLinkType)this.eventlinktype.clone();
		if(this.status == null)
			clone.status = null;
		else
			clone.status = (ims.core.vo.lookups.PreActiveActiveInactiveStatus)this.status.clone();
		if(this.sysinfo == null)
			clone.sysinfo = null;
		else
			clone.sysinfo = (ims.vo.SystemInformation)this.sysinfo.clone();
		if(this.targetdatecalculation == null)
			clone.targetdatecalculation = null;
		else
			clone.targetdatecalculation = (ims.pathways.vo.lookups.TargetDateCalculation)this.targetdatecalculation.clone();
		if(this.taxonomymaps == null)
			clone.taxonomymaps = null;
		else
			clone.taxonomymaps = (ims.core.vo.TaxonomyMapCollection)this.taxonomymaps.clone();
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
		if (!(TargetConfigurationVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A TargetConfigurationVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((TargetConfigurationVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((TargetConfigurationVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = super.countFieldsWithValue();
		if(this.taxonomymaps != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 1;
	}
	protected ims.core.vo.TaxonomyMapCollection taxonomymaps;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
