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

package ims.ocrr.forms.choosealternativecontainersdialog;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		OCRR = new OCRRContext(context);
		Core = new CoreContext(context);
	}
	public final class OCRRContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private OCRRContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getMyOrderPotentialSpecimensIsNotNull()
		{
			return !cx_OCRRMyOrderPotentialSpecimens.getValueIsNull(context);
		}
		public ims.ocrr.vo.OrderSpecimenVoCollection getMyOrderPotentialSpecimens()
		{
			return (ims.ocrr.vo.OrderSpecimenVoCollection)cx_OCRRMyOrderPotentialSpecimens.getValue(context);
		}
		public void setMyOrderPotentialSpecimens(ims.ocrr.vo.OrderSpecimenVoCollection value)
		{
			cx_OCRRMyOrderPotentialSpecimens.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OCRRMyOrderPotentialSpecimens = new ims.framework.ContextVariable("OCRR.MyOrderPotentialSpecimens", "_cv_OCRR.MyOrderPotentialSpecimens");
		public boolean getReWrittenOrderInvestigationsIsNotNull()
		{
			return !cx_OCRRReWrittenOrderInvestigations.getValueIsNull(context);
		}
		public ims.ocrr.vo.OrderInvestigationVoCollection getReWrittenOrderInvestigations()
		{
			return (ims.ocrr.vo.OrderInvestigationVoCollection)cx_OCRRReWrittenOrderInvestigations.getValue(context);
		}
		public void setReWrittenOrderInvestigations(ims.ocrr.vo.OrderInvestigationVoCollection value)
		{
			cx_OCRRReWrittenOrderInvestigations.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OCRRReWrittenOrderInvestigations = new ims.framework.ContextVariable("OCRR.ReWrittenOrderInvestigations", "_cv_OCRR.ReWrittenOrderInvestigations");

		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPatientShortIsNotNull()
		{
			return !cx_CorePatientShort.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientShort()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientShort.getValue(context);
		}
		public void setPatientShort(ims.core.vo.PatientShort value)
		{
			cx_CorePatientShort.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientShort = new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort");

		private ims.framework.Context context;
	}

	public OCRRContext OCRR;
	public CoreContext Core;
}
