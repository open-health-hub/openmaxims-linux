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

package ims.generalmedical.vo.beans;

public class MskSpineExamFindingVoBean extends ims.vo.ValueObjectBean
{
	public MskSpineExamFindingVoBean()
	{
	}
	public MskSpineExamFindingVoBean(ims.generalmedical.vo.MskSpineExamFindingVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.spinesitename = vo.getSpineSiteName();
		this.spinesitedetails = vo.getSpineSiteDetails();
		this.spinefindinterpretation = vo.getSpineFindInterpretation();
		this.isproblem = vo.getIsProblem();
		this.findingtype = vo.getFindingType() == null ? null : (ims.vo.LookupInstanceBean)vo.getFindingType().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.generalmedical.vo.MskSpineExamFindingVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.spinesitename = vo.getSpineSiteName();
		this.spinesitedetails = vo.getSpineSiteDetails();
		this.spinefindinterpretation = vo.getSpineFindInterpretation();
		this.isproblem = vo.getIsProblem();
		this.findingtype = vo.getFindingType() == null ? null : (ims.vo.LookupInstanceBean)vo.getFindingType().getBean();
	}

	public ims.generalmedical.vo.MskSpineExamFindingVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.generalmedical.vo.MskSpineExamFindingVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.generalmedical.vo.MskSpineExamFindingVo vo = null;
		if(map != null)
			vo = (ims.generalmedical.vo.MskSpineExamFindingVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.generalmedical.vo.MskSpineExamFindingVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public String getSpineSiteName()
	{
		return this.spinesitename;
	}
	public void setSpineSiteName(String value)
	{
		this.spinesitename = value;
	}
	public String getSpineSiteDetails()
	{
		return this.spinesitedetails;
	}
	public void setSpineSiteDetails(String value)
	{
		this.spinesitedetails = value;
	}
	public String getSpineFindInterpretation()
	{
		return this.spinefindinterpretation;
	}
	public void setSpineFindInterpretation(String value)
	{
		this.spinefindinterpretation = value;
	}
	public Boolean getIsProblem()
	{
		return this.isproblem;
	}
	public void setIsProblem(Boolean value)
	{
		this.isproblem = value;
	}
	public ims.vo.LookupInstanceBean getFindingType()
	{
		return this.findingtype;
	}
	public void setFindingType(ims.vo.LookupInstanceBean value)
	{
		this.findingtype = value;
	}

	private Integer id;
	private int version;
	private String spinesitename;
	private String spinesitedetails;
	private String spinefindinterpretation;
	private Boolean isproblem;
	private ims.vo.LookupInstanceBean findingtype;
}
