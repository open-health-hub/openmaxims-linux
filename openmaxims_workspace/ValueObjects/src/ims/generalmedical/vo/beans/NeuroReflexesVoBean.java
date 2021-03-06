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

public class NeuroReflexesVoBean extends ims.vo.ValueObjectBean
{
	public NeuroReflexesVoBean()
	{
	}
	public NeuroReflexesVoBean(ims.generalmedical.vo.NeuroReflexesVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.peripheralreflexes = vo.getPeripheralReflexes() == null ? null : vo.getPeripheralReflexes().getBeanCollection();
		this.analtests = vo.getAnalTests() == null ? null : vo.getAnalTests().getBeanCollection();
		this.othertests = vo.getOtherTests() == null ? null : vo.getOtherTests().getBeanCollection();
		this.clinicalcontact = vo.getClinicalContact() == null ? null : (ims.core.vo.beans.ClinicalContactShortVoBean)vo.getClinicalContact().getBean();
		this.authoringcp = vo.getAuthoringCP() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getAuthoringCP().getBean();
		this.authoringdatetime = vo.getAuthoringDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAuthoringDateTime().getBean();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.generalmedical.vo.NeuroReflexesVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.peripheralreflexes = vo.getPeripheralReflexes() == null ? null : vo.getPeripheralReflexes().getBeanCollection();
		this.analtests = vo.getAnalTests() == null ? null : vo.getAnalTests().getBeanCollection();
		this.othertests = vo.getOtherTests() == null ? null : vo.getOtherTests().getBeanCollection();
		this.clinicalcontact = vo.getClinicalContact() == null ? null : (ims.core.vo.beans.ClinicalContactShortVoBean)vo.getClinicalContact().getBean(map);
		this.authoringcp = vo.getAuthoringCP() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getAuthoringCP().getBean(map);
		this.authoringdatetime = vo.getAuthoringDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAuthoringDateTime().getBean();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
	}

	public ims.generalmedical.vo.NeuroReflexesVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.generalmedical.vo.NeuroReflexesVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.generalmedical.vo.NeuroReflexesVo vo = null;
		if(map != null)
			vo = (ims.generalmedical.vo.NeuroReflexesVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.generalmedical.vo.NeuroReflexesVo();
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
	public ims.generalmedical.vo.beans.NeuroReflexPeripheralTestsVoBean[] getPeripheralReflexes()
	{
		return this.peripheralreflexes;
	}
	public void setPeripheralReflexes(ims.generalmedical.vo.beans.NeuroReflexPeripheralTestsVoBean[] value)
	{
		this.peripheralreflexes = value;
	}
	public ims.generalmedical.vo.beans.NeuroReflexAnalTestsVoBean[] getAnalTests()
	{
		return this.analtests;
	}
	public void setAnalTests(ims.generalmedical.vo.beans.NeuroReflexAnalTestsVoBean[] value)
	{
		this.analtests = value;
	}
	public ims.generalmedical.vo.beans.NeuroReflexOtherTestsVoBean[] getOtherTests()
	{
		return this.othertests;
	}
	public void setOtherTests(ims.generalmedical.vo.beans.NeuroReflexOtherTestsVoBean[] value)
	{
		this.othertests = value;
	}
	public ims.core.vo.beans.ClinicalContactShortVoBean getClinicalContact()
	{
		return this.clinicalcontact;
	}
	public void setClinicalContact(ims.core.vo.beans.ClinicalContactShortVoBean value)
	{
		this.clinicalcontact = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getAuthoringCP()
	{
		return this.authoringcp;
	}
	public void setAuthoringCP(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.authoringcp = value;
	}
	public ims.framework.utils.beans.DateTimeBean getAuthoringDateTime()
	{
		return this.authoringdatetime;
	}
	public void setAuthoringDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.authoringdatetime = value;
	}
	public ims.vo.RefVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.vo.RefVoBean value)
	{
		this.carecontext = value;
	}

	private Integer id;
	private int version;
	private ims.generalmedical.vo.beans.NeuroReflexPeripheralTestsVoBean[] peripheralreflexes;
	private ims.generalmedical.vo.beans.NeuroReflexAnalTestsVoBean[] analtests;
	private ims.generalmedical.vo.beans.NeuroReflexOtherTestsVoBean[] othertests;
	private ims.core.vo.beans.ClinicalContactShortVoBean clinicalcontact;
	private ims.core.vo.beans.HcpLiteVoBean authoringcp;
	private ims.framework.utils.beans.DateTimeBean authoringdatetime;
	private ims.vo.RefVoBean carecontext;
}
