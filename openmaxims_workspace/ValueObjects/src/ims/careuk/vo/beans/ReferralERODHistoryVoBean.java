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

package ims.careuk.vo.beans;

public class ReferralERODHistoryVoBean extends ims.vo.ValueObjectBean
{
	public ReferralERODHistoryVoBean()
	{
	}
	public ReferralERODHistoryVoBean(ims.careuk.vo.ReferralERODHistoryVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.eroddate1 = vo.getERODDate1() == null ? null : (ims.framework.utils.beans.DateBean)vo.getERODDate1().getBean();
		this.eroddate2 = vo.getERODDate2() == null ? null : (ims.framework.utils.beans.DateBean)vo.getERODDate2().getBean();
		this.patavailfromdate = vo.getPatAvailFromDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getPatAvailFromDate().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.careuk.vo.ReferralERODHistoryVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.eroddate1 = vo.getERODDate1() == null ? null : (ims.framework.utils.beans.DateBean)vo.getERODDate1().getBean();
		this.eroddate2 = vo.getERODDate2() == null ? null : (ims.framework.utils.beans.DateBean)vo.getERODDate2().getBean();
		this.patavailfromdate = vo.getPatAvailFromDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getPatAvailFromDate().getBean();
	}

	public ims.careuk.vo.ReferralERODHistoryVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.careuk.vo.ReferralERODHistoryVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.careuk.vo.ReferralERODHistoryVo vo = null;
		if(map != null)
			vo = (ims.careuk.vo.ReferralERODHistoryVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.careuk.vo.ReferralERODHistoryVo();
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
	public ims.framework.utils.beans.DateBean getERODDate1()
	{
		return this.eroddate1;
	}
	public void setERODDate1(ims.framework.utils.beans.DateBean value)
	{
		this.eroddate1 = value;
	}
	public ims.framework.utils.beans.DateBean getERODDate2()
	{
		return this.eroddate2;
	}
	public void setERODDate2(ims.framework.utils.beans.DateBean value)
	{
		this.eroddate2 = value;
	}
	public ims.framework.utils.beans.DateBean getPatAvailFromDate()
	{
		return this.patavailfromdate;
	}
	public void setPatAvailFromDate(ims.framework.utils.beans.DateBean value)
	{
		this.patavailfromdate = value;
	}

	private Integer id;
	private int version;
	private ims.framework.utils.beans.DateBean eroddate1;
	private ims.framework.utils.beans.DateBean eroddate2;
	private ims.framework.utils.beans.DateBean patavailfromdate;
}
