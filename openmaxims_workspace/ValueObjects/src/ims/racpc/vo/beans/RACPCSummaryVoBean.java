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

package ims.racpc.vo.beans;

public class RACPCSummaryVoBean extends ims.vo.ValueObjectBean
{
	public RACPCSummaryVoBean()
	{
	}
	public RACPCSummaryVoBean(ims.racpc.vo.RACPCSummaryVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.isclinicaldetailscomplete = vo.getIsClinicalDetailsComplete();
		this.dateclinicaldetailscomplete = vo.getDateClinicalDetailsComplete() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateClinicalDetailsComplete().getBean();
		this.summarydocument = vo.getSummaryDocument() == null ? null : (ims.racpc.vo.beans.PatientDocumentForRACPCSummaryVoBean)vo.getSummaryDocument().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.racpc.vo.RACPCSummaryVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.isclinicaldetailscomplete = vo.getIsClinicalDetailsComplete();
		this.dateclinicaldetailscomplete = vo.getDateClinicalDetailsComplete() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateClinicalDetailsComplete().getBean();
		this.summarydocument = vo.getSummaryDocument() == null ? null : (ims.racpc.vo.beans.PatientDocumentForRACPCSummaryVoBean)vo.getSummaryDocument().getBean(map);
	}

	public ims.racpc.vo.RACPCSummaryVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.racpc.vo.RACPCSummaryVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.racpc.vo.RACPCSummaryVo vo = null;
		if(map != null)
			vo = (ims.racpc.vo.RACPCSummaryVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.racpc.vo.RACPCSummaryVo();
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
	public ims.vo.RefVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.vo.RefVoBean value)
	{
		this.patient = value;
	}
	public ims.vo.RefVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.vo.RefVoBean value)
	{
		this.carecontext = value;
	}
	public Boolean getIsClinicalDetailsComplete()
	{
		return this.isclinicaldetailscomplete;
	}
	public void setIsClinicalDetailsComplete(Boolean value)
	{
		this.isclinicaldetailscomplete = value;
	}
	public ims.framework.utils.beans.DateBean getDateClinicalDetailsComplete()
	{
		return this.dateclinicaldetailscomplete;
	}
	public void setDateClinicalDetailsComplete(ims.framework.utils.beans.DateBean value)
	{
		this.dateclinicaldetailscomplete = value;
	}
	public ims.racpc.vo.beans.PatientDocumentForRACPCSummaryVoBean getSummaryDocument()
	{
		return this.summarydocument;
	}
	public void setSummaryDocument(ims.racpc.vo.beans.PatientDocumentForRACPCSummaryVoBean value)
	{
		this.summarydocument = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean patient;
	private ims.vo.RefVoBean carecontext;
	private Boolean isclinicaldetailscomplete;
	private ims.framework.utils.beans.DateBean dateclinicaldetailscomplete;
	private ims.racpc.vo.beans.PatientDocumentForRACPCSummaryVoBean summarydocument;
}
