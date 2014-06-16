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

package ims.emergency.forms.attendanceclinicalnotedialog;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.emergency.domain.AttendanceClinicalNoteDialog.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.emergency.domain.AttendanceClinicalNoteDialog domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbNoteTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctnNoteDetails().cmbNoteType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.emergency.vo.lookups.AttendanceClinicalNoteType existingInstance = (ims.emergency.vo.lookups.AttendanceClinicalNoteType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbNoteTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.emergency.vo.lookups.AttendanceClinicalNoteType)
		{
			ims.emergency.vo.lookups.AttendanceClinicalNoteType instance = (ims.emergency.vo.lookups.AttendanceClinicalNoteType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbNoteTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.emergency.vo.lookups.AttendanceClinicalNoteType existingInstance = (ims.emergency.vo.lookups.AttendanceClinicalNoteType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctnNoteDetails().cmbNoteType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbNoteTypeLookup()
	{
		this.form.ctnNoteDetails().cmbNoteType().clear();
		ims.emergency.vo.lookups.AttendanceClinicalNoteTypeCollection lookupCollection = ims.emergency.vo.lookups.LookupHelper.getAttendanceClinicalNoteType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnNoteDetails().cmbNoteType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbNoteTypeLookupValue(int id)
	{
		ims.emergency.vo.lookups.AttendanceClinicalNoteType instance = ims.emergency.vo.lookups.LookupHelper.getAttendanceClinicalNoteTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctnNoteDetails().cmbNoteType().setValue(instance);
	}
	protected final void defaultcmbNoteTypeLookupValue()
	{
		this.form.ctnNoteDetails().cmbNoteType().setValue((ims.emergency.vo.lookups.AttendanceClinicalNoteType)domain.getLookupService().getDefaultInstance(ims.emergency.vo.lookups.AttendanceClinicalNoteType.class, engine.getFormName().getID(), ims.emergency.vo.lookups.AttendanceClinicalNoteType.TYPE_ID));
	}
	protected final void oncmbDisciplineValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctnNoteDetails().cmbDiscipline().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.HcpDisType existingInstance = (ims.core.vo.lookups.HcpDisType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbDisciplineLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.HcpDisType)
		{
			ims.core.vo.lookups.HcpDisType instance = (ims.core.vo.lookups.HcpDisType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbDisciplineLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.HcpDisType existingInstance = (ims.core.vo.lookups.HcpDisType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctnNoteDetails().cmbDiscipline().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbDisciplineLookup()
	{
		this.form.ctnNoteDetails().cmbDiscipline().clear();
		ims.core.vo.lookups.HcpDisTypeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getHcpDisType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnNoteDetails().cmbDiscipline().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbDisciplineLookupValue(int id)
	{
		ims.core.vo.lookups.HcpDisType instance = ims.core.vo.lookups.LookupHelper.getHcpDisTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctnNoteDetails().cmbDiscipline().setValue(instance);
	}
	protected final void defaultcmbDisciplineLookupValue()
	{
		this.form.ctnNoteDetails().cmbDiscipline().setValue((ims.core.vo.lookups.HcpDisType)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.HcpDisType.class, engine.getFormName().getID(), ims.core.vo.lookups.HcpDisType.TYPE_ID));
	}
	protected final void oncmbSpecialtyValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctnNoteDetails().cmbSpecialty().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.Specialty existingInstance = (ims.core.vo.lookups.Specialty)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbSpecialtyLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.Specialty)
		{
			ims.core.vo.lookups.Specialty instance = (ims.core.vo.lookups.Specialty)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbSpecialtyLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.Specialty existingInstance = (ims.core.vo.lookups.Specialty)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctnNoteDetails().cmbSpecialty().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbSpecialtyLookup()
	{
		this.form.ctnNoteDetails().cmbSpecialty().clear();
		ims.core.vo.lookups.SpecialtyCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getSpecialty(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnNoteDetails().cmbSpecialty().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbSpecialtyLookupValue(int id)
	{
		ims.core.vo.lookups.Specialty instance = ims.core.vo.lookups.LookupHelper.getSpecialtyInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctnNoteDetails().cmbSpecialty().setValue(instance);
	}
	protected final void defaultcmbSpecialtyLookupValue()
	{
		this.form.ctnNoteDetails().cmbSpecialty().setValue((ims.core.vo.lookups.Specialty)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.Specialty.class, engine.getFormName().getID(), ims.core.vo.lookups.Specialty.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.emergency.domain.AttendanceClinicalNoteDialog domain;
}