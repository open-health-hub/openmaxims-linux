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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:31
 *
 */
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Vasile Purdila
 */
public class ResultsToBePrintedVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.ResultsToBePrintedVo copy(ims.ocrr.vo.ResultsToBePrintedVo valueObjectDest, ims.ocrr.vo.ResultsToBePrintedVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CentralBatchPrint(valueObjectSrc.getID_CentralBatchPrint());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ResultToBePrinted
		valueObjectDest.setResultToBePrinted(valueObjectSrc.getResultToBePrinted());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createResultsToBePrintedVoCollectionFromCentralBatchPrint(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.CentralBatchPrint objects.
	 */
	public static ims.ocrr.vo.ResultsToBePrintedVoCollection createResultsToBePrintedVoCollectionFromCentralBatchPrint(java.util.Set domainObjectSet)	
	{
		return createResultsToBePrintedVoCollectionFromCentralBatchPrint(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.CentralBatchPrint objects.
	 */
	public static ims.ocrr.vo.ResultsToBePrintedVoCollection createResultsToBePrintedVoCollectionFromCentralBatchPrint(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.ResultsToBePrintedVoCollection voList = new ims.ocrr.vo.ResultsToBePrintedVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.CentralBatchPrint domainObject = (ims.ocrr.orderingresults.domain.objects.CentralBatchPrint) iterator.next();
			ims.ocrr.vo.ResultsToBePrintedVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.CentralBatchPrint objects.
	 */
	public static ims.ocrr.vo.ResultsToBePrintedVoCollection createResultsToBePrintedVoCollectionFromCentralBatchPrint(java.util.List domainObjectList) 
	{
		return createResultsToBePrintedVoCollectionFromCentralBatchPrint(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.CentralBatchPrint objects.
	 */
	public static ims.ocrr.vo.ResultsToBePrintedVoCollection createResultsToBePrintedVoCollectionFromCentralBatchPrint(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.ResultsToBePrintedVoCollection voList = new ims.ocrr.vo.ResultsToBePrintedVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.CentralBatchPrint domainObject = (ims.ocrr.orderingresults.domain.objects.CentralBatchPrint) domainObjectList.get(i);
			ims.ocrr.vo.ResultsToBePrintedVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.ocrr.orderingresults.domain.objects.CentralBatchPrint set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCentralBatchPrintSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultsToBePrintedVoCollection voCollection) 
	 {
	 	return extractCentralBatchPrintSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCentralBatchPrintSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultsToBePrintedVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ResultsToBePrintedVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.CentralBatchPrint domainObject = ResultsToBePrintedVoAssembler.extractCentralBatchPrint(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.ocrr.orderingresults.domain.objects.CentralBatchPrint list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCentralBatchPrintList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultsToBePrintedVoCollection voCollection) 
	 {
	 	return extractCentralBatchPrintList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCentralBatchPrintList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultsToBePrintedVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ResultsToBePrintedVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.CentralBatchPrint domainObject = ResultsToBePrintedVoAssembler.extractCentralBatchPrint(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.CentralBatchPrint object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.CentralBatchPrint
	 */
	 public static ims.ocrr.vo.ResultsToBePrintedVo create(ims.ocrr.orderingresults.domain.objects.CentralBatchPrint domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.CentralBatchPrint object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.ResultsToBePrintedVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.CentralBatchPrint domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.ResultsToBePrintedVo valueObject = (ims.ocrr.vo.ResultsToBePrintedVo) map.getValueObject(domainObject, ims.ocrr.vo.ResultsToBePrintedVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.ResultsToBePrintedVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.CentralBatchPrint
	 */
	 public static ims.ocrr.vo.ResultsToBePrintedVo insert(ims.ocrr.vo.ResultsToBePrintedVo valueObject, ims.ocrr.orderingresults.domain.objects.CentralBatchPrint domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.CentralBatchPrint
	 */
	 public static ims.ocrr.vo.ResultsToBePrintedVo insert(DomainObjectMap map, ims.ocrr.vo.ResultsToBePrintedVo valueObject, ims.ocrr.orderingresults.domain.objects.CentralBatchPrint domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CentralBatchPrint(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// ResultToBePrinted
		if (domainObject.getResultToBePrinted() != null)
		{
			if(domainObject.getResultToBePrinted() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getResultToBePrinted();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setResultToBePrinted(new ims.ocrr.orderingresults.vo.OrderInvestigationRefVo(id, -1));				
			}
			else
			{
				valueObject.setResultToBePrinted(new ims.ocrr.orderingresults.vo.OrderInvestigationRefVo(domainObject.getResultToBePrinted().getId(), domainObject.getResultToBePrinted().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.CentralBatchPrint extractCentralBatchPrint(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultsToBePrintedVo valueObject) 
	{
		return 	extractCentralBatchPrint(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.CentralBatchPrint extractCentralBatchPrint(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultsToBePrintedVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CentralBatchPrint();
		ims.ocrr.orderingresults.domain.objects.CentralBatchPrint domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.CentralBatchPrint)domMap.get(valueObject);
			}
			// ims.ocrr.vo.ResultsToBePrintedVo ID_CentralBatchPrint field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.CentralBatchPrint();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CentralBatchPrint());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.CentralBatchPrint)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.CentralBatchPrint) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.CentralBatchPrint.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CentralBatchPrint());

		ims.ocrr.orderingresults.domain.objects.OrderInvestigation value1 = null;
		if ( null != valueObject.getResultToBePrinted() ) 
		{
			if (valueObject.getResultToBePrinted().getBoId() == null)
			{
				if (domMap.get(valueObject.getResultToBePrinted()) != null)
				{
					value1 = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domMap.get(valueObject.getResultToBePrinted());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getResultToBePrinted();	
			}
			else
			{
				value1 = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OrderInvestigation.class, valueObject.getResultToBePrinted().getBoId());
			}
		}
		domainObject.setResultToBePrinted(value1);

		return domainObject;
	}

}
