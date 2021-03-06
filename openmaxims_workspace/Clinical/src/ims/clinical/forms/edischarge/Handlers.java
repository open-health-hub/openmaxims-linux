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

package ims.clinical.forms.edischarge;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected void onFormModeChanged();
	abstract protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onLnkReturnClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnStartClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onlyrDetailsTabChanged(ims.framework.LayerBridge tab);
	abstract protected void onCcDiagnosisValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCcOpsProcsValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCcAllergiesValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCc1ValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCcClinicalInfoValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCcFuturePlanValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCcMedicationValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCcPreviewValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCcReadyToLeaveValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelSuppClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveSuppClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnEditSuppClick() throws ims.framework.exceptions.PresentationLogicException;

	public final void setContext(ims.framework.UIEngine engine, GenForm form)
	{
		this.engine = engine;
		this.form = form;

		this.form.setFormModeChangedEvent(new FormModeChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle()
			{
				onFormModeChanged();
			}
		});
		this.form.setFormOpenEvent(new FormOpen()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object[] args) throws ims.framework.exceptions.PresentationLogicException
			{
				onFormOpen(args);
			}
		});
		this.form.lnkReturn().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onLnkReturnClick();
			}
		});
		this.form.btnStart().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnStartClick();
			}
		});
		this.form.lyrDetails().tabPageDiagnosis().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrDetailstabPageDiagnosisActivated();
			}
		});
		this.form.lyrDetails().tabPageOpsProcs().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrDetailstabPageOpsProcsActivated();
			}
		});
		this.form.lyrDetails().tabPageAlerts().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrDetailstabPageAlertsActivated();
			}
		});
		this.form.lyrDetails().tabPageAssessment().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrDetailstabPageAssessmentActivated();
			}
		});
		this.form.lyrDetails().tabPageClinicalInfo().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrDetailstabPageClinicalInfoActivated();
			}
		});
		this.form.lyrDetails().tabPageFuturePlan().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrDetailstabPageFuturePlanActivated();
			}
		});
		this.form.lyrDetails().tabPageMedication().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrDetailstabPageMedicationActivated();
			}
		});
		this.form.lyrDetails().tabPagePreview().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrDetailstabPagePreviewActivated();
			}
		});
		this.form.lyrDetails().tabPageReady().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrDetailstabPageReadyActivated();
			}
		});
		this.form.lyrDetails().tabPageSupplementary().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrDetailstabPageSupplementaryActivated();
			}
		});
		this.form.lyrDetails().tabPageDiagnosis().setccDiagnosisValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCcDiagnosisValueChanged();
			}
		});
		this.form.lyrDetails().tabPageOpsProcs().setccOpsProcsValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCcOpsProcsValueChanged();
			}
		});
		this.form.lyrDetails().tabPageAlerts().setccAllergiesValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCcAllergiesValueChanged();
			}
		});
		this.form.lyrDetails().tabPageAssessment().setcc1ValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCc1ValueChanged();
			}
		});
		this.form.lyrDetails().tabPageClinicalInfo().setccClinicalInfoValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCcClinicalInfoValueChanged();
			}
		});
		this.form.lyrDetails().tabPageFuturePlan().setccFuturePlanValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCcFuturePlanValueChanged();
			}
		});
		this.form.lyrDetails().tabPageMedication().setccMedicationValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCcMedicationValueChanged();
			}
		});
		this.form.lyrDetails().tabPagePreview().setccPreviewValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCcPreviewValueChanged();
			}
		});
		this.form.lyrDetails().tabPageReady().setccReadyToLeaveValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCcReadyToLeaveValueChanged();
			}
		});
		this.form.lyrDetails().tabPageSupplementary().btnCancelSupp().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelSuppClick();
			}
		});
		this.form.lyrDetails().tabPageSupplementary().btnSaveSupp().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveSuppClick();
			}
		});
		this.form.lyrDetails().tabPageSupplementary().btnEditSupp().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnEditSuppClick();
			}
		});
	}
	private void onlyrDetailstabPageDiagnosisActivated()
	{
		this.form.lyrDetails().showtabPageDiagnosis();
		onlyrDetailsTabChanged(this.form.lyrDetails().tabPageDiagnosis());
	}
	private void onlyrDetailstabPageOpsProcsActivated()
	{
		this.form.lyrDetails().showtabPageOpsProcs();
		onlyrDetailsTabChanged(this.form.lyrDetails().tabPageOpsProcs());
	}
	private void onlyrDetailstabPageAlertsActivated()
	{
		this.form.lyrDetails().showtabPageAlerts();
		onlyrDetailsTabChanged(this.form.lyrDetails().tabPageAlerts());
	}
	private void onlyrDetailstabPageAssessmentActivated()
	{
		this.form.lyrDetails().showtabPageAssessment();
		onlyrDetailsTabChanged(this.form.lyrDetails().tabPageAssessment());
	}
	private void onlyrDetailstabPageClinicalInfoActivated()
	{
		this.form.lyrDetails().showtabPageClinicalInfo();
		onlyrDetailsTabChanged(this.form.lyrDetails().tabPageClinicalInfo());
	}
	private void onlyrDetailstabPageFuturePlanActivated()
	{
		this.form.lyrDetails().showtabPageFuturePlan();
		onlyrDetailsTabChanged(this.form.lyrDetails().tabPageFuturePlan());
	}
	private void onlyrDetailstabPageMedicationActivated()
	{
		this.form.lyrDetails().showtabPageMedication();
		onlyrDetailsTabChanged(this.form.lyrDetails().tabPageMedication());
	}
	private void onlyrDetailstabPagePreviewActivated()
	{
		this.form.lyrDetails().showtabPagePreview();
		onlyrDetailsTabChanged(this.form.lyrDetails().tabPagePreview());
	}
	private void onlyrDetailstabPageReadyActivated()
	{
		this.form.lyrDetails().showtabPageReady();
		onlyrDetailsTabChanged(this.form.lyrDetails().tabPageReady());
	}
	private void onlyrDetailstabPageSupplementaryActivated()
	{
		this.form.lyrDetails().showtabPageSupplementary();
		onlyrDetailsTabChanged(this.form.lyrDetails().tabPageSupplementary());
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}
