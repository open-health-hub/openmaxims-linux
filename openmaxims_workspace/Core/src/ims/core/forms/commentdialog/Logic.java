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
// This code was generated by Rory Fitzpatrick using IMS Development Environment (version 1.70 build 3478.14513)
// Copyright (C) 1995-2009 IMS MAXIMS. All rights reserved.

package ims.core.forms.commentdialog;

import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		form.txtComment().setValue(form.getGlobalContext().Core.getCommentDialogString());
		
		if(form.getGlobalContext().Core.getCommentDialogReadOnly() != null && form.getGlobalContext().Core.getCommentDialogReadOnly())
		{
			form.btnCancel().setText("Close");
			form.setMode(FormMode.VIEW);
		}
		if(form.getGlobalContext().Core.getCommentDialogTitle() != null)
		{
			engine.setCaption(form.getGlobalContext().Core.getCommentDialogTitle());
		}
	}
	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getGlobalContext().Core.setCommentDialogString(form.txtComment().getValue());
		engine.close(DialogResult.OK);
	}
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
}
