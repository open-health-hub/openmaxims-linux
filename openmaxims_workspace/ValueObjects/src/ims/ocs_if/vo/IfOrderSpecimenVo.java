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

package ims.ocs_if.vo;

/**
 * Linked to OCRR.OrderingResults.OrderSpecimen business object (ID: 1070100010).
 */
public class IfOrderSpecimenVo extends ims.ocs_if.vo.IfOrdSpecLiteVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public IfOrderSpecimenVo()
	{
	}
	public IfOrderSpecimenVo(Integer id, int version)
	{
		super(id, version);
	}
	public IfOrderSpecimenVo(ims.ocs_if.vo.beans.IfOrderSpecimenVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.colldatetimeplacer = bean.getCollDateTimePlacer() == null ? null : bean.getCollDateTimePlacer().buildDateTime();
		this.colldatetimefiller = bean.getCollDateTimeFiller() == null ? null : bean.getCollDateTimeFiller().buildDateTime();
		this.coltimefillersupplied = bean.getColTimeFillerSupplied();
		this.collenddatetimeplacer = bean.getCollEndDateTimePlacer() == null ? null : bean.getCollEndDateTimePlacer().buildDateTime();
		this.collenddatetimefiller = bean.getCollEndDateTimeFiller() == null ? null : bean.getCollEndDateTimeFiller().buildDateTime();
		this.sitetext = bean.getSiteText();
		this.specimensource = bean.getSpecimenSource() == null ? null : ims.ocrr.vo.lookups.SpecimenType.buildLookup(bean.getSpecimenSource());
		this.discipline = bean.getDiscipline() == null ? null : bean.getDiscipline().buildVo();
		this.collectingmos = bean.getCollectingMos() == null ? null : bean.getCollectingMos().buildVo();
		this.ispatientcollect = bean.getIsPatientCollect();
		this.isawaitingcollection = bean.getIsAwaitingCollection();
		this.receiveddatetime = bean.getReceivedDateTime() == null ? null : bean.getReceivedDateTime().buildDateTime();
		this.receivedtimesupplied = bean.getReceivedTimeSupplied();
		this.fillerordnum = bean.getFillerOrdNum();
		this.collectorcomment = bean.getCollectorComment();
		this.sitecd = bean.getSiteCd() == null ? null : ims.ocrr.vo.lookups.SpecimenSite.buildLookup(bean.getSiteCd());
		this.wasprocessed = bean.getWasProcessed();
		this.placerordnum = bean.getPlacerOrdNum();
		this.dftspecimenresulted = bean.getDftSpecimenResulted() == null ? null : bean.getDftSpecimenResulted().buildDateTime();
		this.dftspecimenresultedtimesupplied = bean.getDftSpecimenResultedTimeSupplied();
		this.investigations = ims.ocs_if.vo.IfOrderInvestigationVoCollection.buildFromBeanCollection(bean.getInvestigations());
		this.order = bean.getOrder() == null ? null : new ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo(new Integer(bean.getOrder().getId()), bean.getOrder().getVersion());
		this.pathresult = ims.ocs_if.vo.IfOcsPathResultVoCollection.buildFromBeanCollection(bean.getPathResult());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocs_if.vo.beans.IfOrderSpecimenVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.colldatetimeplacer = bean.getCollDateTimePlacer() == null ? null : bean.getCollDateTimePlacer().buildDateTime();
		this.colldatetimefiller = bean.getCollDateTimeFiller() == null ? null : bean.getCollDateTimeFiller().buildDateTime();
		this.coltimefillersupplied = bean.getColTimeFillerSupplied();
		this.collenddatetimeplacer = bean.getCollEndDateTimePlacer() == null ? null : bean.getCollEndDateTimePlacer().buildDateTime();
		this.collenddatetimefiller = bean.getCollEndDateTimeFiller() == null ? null : bean.getCollEndDateTimeFiller().buildDateTime();
		this.sitetext = bean.getSiteText();
		this.specimensource = bean.getSpecimenSource() == null ? null : ims.ocrr.vo.lookups.SpecimenType.buildLookup(bean.getSpecimenSource());
		this.discipline = bean.getDiscipline() == null ? null : bean.getDiscipline().buildVo(map);
		this.collectingmos = bean.getCollectingMos() == null ? null : bean.getCollectingMos().buildVo(map);
		this.ispatientcollect = bean.getIsPatientCollect();
		this.isawaitingcollection = bean.getIsAwaitingCollection();
		this.receiveddatetime = bean.getReceivedDateTime() == null ? null : bean.getReceivedDateTime().buildDateTime();
		this.receivedtimesupplied = bean.getReceivedTimeSupplied();
		this.fillerordnum = bean.getFillerOrdNum();
		this.collectorcomment = bean.getCollectorComment();
		this.sitecd = bean.getSiteCd() == null ? null : ims.ocrr.vo.lookups.SpecimenSite.buildLookup(bean.getSiteCd());
		this.wasprocessed = bean.getWasProcessed();
		this.placerordnum = bean.getPlacerOrdNum();
		this.dftspecimenresulted = bean.getDftSpecimenResulted() == null ? null : bean.getDftSpecimenResulted().buildDateTime();
		this.dftspecimenresultedtimesupplied = bean.getDftSpecimenResultedTimeSupplied();
		this.investigations = ims.ocs_if.vo.IfOrderInvestigationVoCollection.buildFromBeanCollection(bean.getInvestigations());
		this.order = bean.getOrder() == null ? null : new ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo(new Integer(bean.getOrder().getId()), bean.getOrder().getVersion());
		this.pathresult = ims.ocs_if.vo.IfOcsPathResultVoCollection.buildFromBeanCollection(bean.getPathResult());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocs_if.vo.beans.IfOrderSpecimenVoBean bean = null;
		if(map != null)
			bean = (ims.ocs_if.vo.beans.IfOrderSpecimenVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ocs_if.vo.beans.IfOrderSpecimenVoBean();
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
		if(fieldName.equals("INVESTIGATIONS"))
			return getInvestigations();
		if(fieldName.equals("ORDER"))
			return getOrder();
		if(fieldName.equals("PATHRESULT"))
			return getPathResult();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getInvestigationsIsNotNull()
	{
		return this.investigations != null;
	}
	public ims.ocs_if.vo.IfOrderInvestigationVoCollection getInvestigations()
	{
		return this.investigations;
	}
	public void setInvestigations(ims.ocs_if.vo.IfOrderInvestigationVoCollection value)
	{
		this.isValidated = false;
		this.investigations = value;
	}
	public boolean getOrderIsNotNull()
	{
		return this.order != null;
	}
	public ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo getOrder()
	{
		return this.order;
	}
	public void setOrder(ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo value)
	{
		this.isValidated = false;
		this.order = value;
	}
	public boolean getPathResultIsNotNull()
	{
		return this.pathresult != null;
	}
	public ims.ocs_if.vo.IfOcsPathResultVoCollection getPathResult()
	{
		return this.pathresult;
	}
	public void setPathResult(ims.ocs_if.vo.IfOcsPathResultVoCollection value)
	{
		this.isValidated = false;
		this.pathresult = value;
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
		if(this.discipline != null)
		{
			if(!this.discipline.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.collectingmos != null)
		{
			if(!this.collectingmos.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.investigations != null)
		{
			if(!this.investigations.isValidated())
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
		if(this.sitetext != null)
			if(this.sitetext.length() > 255)
				listOfErrors.add("The length of the field [sitetext] in the value object [ims.ocs_if.vo.IfOrderSpecimenVo] is too big. It should be less or equal to 255");
		if(this.specimensource == null)
			listOfErrors.add("SpecimenSource is mandatory");
		if(this.discipline == null)
			listOfErrors.add("Discipline is mandatory");
		if(this.discipline != null)
		{
			String[] listOfOtherErrors = this.discipline.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.collectingmos != null)
		{
			String[] listOfOtherErrors = this.collectingmos.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.ispatientcollect == null)
			listOfErrors.add("IsPatientCollect is mandatory");
		if(this.isawaitingcollection == null)
			listOfErrors.add("IsAwaitingCollection is mandatory");
		if(this.fillerordnum != null)
			if(this.fillerordnum.length() > 20)
				listOfErrors.add("The length of the field [fillerordnum] in the value object [ims.ocs_if.vo.IfOrderSpecimenVo] is too big. It should be less or equal to 20");
		if(this.collectorcomment != null)
			if(this.collectorcomment.length() > 500)
				listOfErrors.add("The length of the field [collectorcomment] in the value object [ims.ocs_if.vo.IfOrderSpecimenVo] is too big. It should be less or equal to 500");
		if(this.placerordnum == null || this.placerordnum.length() == 0)
			listOfErrors.add("PlacerOrdNum is mandatory");
		else if(this.placerordnum.length() > 20)
			listOfErrors.add("The length of the field [placerordnum] in the value object [ims.ocs_if.vo.IfOrderSpecimenVo] is too big. It should be less or equal to 20");
		if(this.investigations != null)
		{
			String[] listOfOtherErrors = this.investigations.validate();
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
	
		IfOrderSpecimenVo clone = new IfOrderSpecimenVo(this.id, this.version);
		
		if(this.colldatetimeplacer == null)
			clone.colldatetimeplacer = null;
		else
			clone.colldatetimeplacer = (ims.framework.utils.DateTime)this.colldatetimeplacer.clone();
		if(this.colldatetimefiller == null)
			clone.colldatetimefiller = null;
		else
			clone.colldatetimefiller = (ims.framework.utils.DateTime)this.colldatetimefiller.clone();
		clone.coltimefillersupplied = this.coltimefillersupplied;
		if(this.collenddatetimeplacer == null)
			clone.collenddatetimeplacer = null;
		else
			clone.collenddatetimeplacer = (ims.framework.utils.DateTime)this.collenddatetimeplacer.clone();
		if(this.collenddatetimefiller == null)
			clone.collenddatetimefiller = null;
		else
			clone.collenddatetimefiller = (ims.framework.utils.DateTime)this.collenddatetimefiller.clone();
		clone.sitetext = this.sitetext;
		if(this.specimensource == null)
			clone.specimensource = null;
		else
			clone.specimensource = (ims.ocrr.vo.lookups.SpecimenType)this.specimensource.clone();
		if(this.discipline == null)
			clone.discipline = null;
		else
			clone.discipline = (ims.core.vo.ServiceLiteVo)this.discipline.clone();
		if(this.collectingmos == null)
			clone.collectingmos = null;
		else
			clone.collectingmos = (ims.core.vo.MemberOfStaffLiteVo)this.collectingmos.clone();
		clone.ispatientcollect = this.ispatientcollect;
		clone.isawaitingcollection = this.isawaitingcollection;
		if(this.receiveddatetime == null)
			clone.receiveddatetime = null;
		else
			clone.receiveddatetime = (ims.framework.utils.DateTime)this.receiveddatetime.clone();
		clone.receivedtimesupplied = this.receivedtimesupplied;
		clone.fillerordnum = this.fillerordnum;
		clone.collectorcomment = this.collectorcomment;
		if(this.sitecd == null)
			clone.sitecd = null;
		else
			clone.sitecd = (ims.ocrr.vo.lookups.SpecimenSite)this.sitecd.clone();
		clone.wasprocessed = this.wasprocessed;
		clone.placerordnum = this.placerordnum;
		if(this.dftspecimenresulted == null)
			clone.dftspecimenresulted = null;
		else
			clone.dftspecimenresulted = (ims.framework.utils.DateTime)this.dftspecimenresulted.clone();
		clone.dftspecimenresultedtimesupplied = this.dftspecimenresultedtimesupplied;
		if(this.investigations == null)
			clone.investigations = null;
		else
			clone.investigations = (ims.ocs_if.vo.IfOrderInvestigationVoCollection)this.investigations.clone();
		clone.order = this.order;
		if(this.pathresult == null)
			clone.pathresult = null;
		else
			clone.pathresult = (ims.ocs_if.vo.IfOcsPathResultVoCollection)this.pathresult.clone();
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
		if (!(IfOrderSpecimenVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A IfOrderSpecimenVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((IfOrderSpecimenVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((IfOrderSpecimenVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = super.countFieldsWithValue();
		if(this.investigations != null)
			count++;
		if(this.order != null)
			count++;
		if(this.pathresult != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 3;
	}
	protected ims.ocs_if.vo.IfOrderInvestigationVoCollection investigations;
	protected ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo order;
	protected ims.ocs_if.vo.IfOcsPathResultVoCollection pathresult;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
