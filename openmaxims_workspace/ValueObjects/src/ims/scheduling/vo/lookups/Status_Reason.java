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

package ims.scheduling.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class Status_Reason extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public Status_Reason()
	{
		super();
	}
	public Status_Reason(int id)
	{
		super(id, "", true);
	}
	public Status_Reason(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public Status_Reason(int id, String text, boolean active, Status_Reason parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public Status_Reason(int id, String text, boolean active, Status_Reason parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public Status_Reason(int id, String text, boolean active, Status_Reason parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static Status_Reason buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new Status_Reason(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (Status_Reason)super.getParentInstance();
	}
	public Status_Reason getParent()
	{
		return (Status_Reason)super.getParentInstance();
	}
	public void setParent(Status_Reason parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		Status_Reason[] typedChildren = new Status_Reason[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (Status_Reason)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof Status_Reason)
		{
			super.addChild((Status_Reason)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof Status_Reason)
		{
			super.removeChild((Status_Reason)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		Status_ReasonCollection result = new Status_ReasonCollection();
		result.add(PROVISIONAL);
		result.add(CONFIRM_RECEIVED);
		result.add(SLOTOPENED);
		result.add(UNCANCEL_RECEIVED);
		result.add(DEALLOCATED);
		result.add(CANCELLED);
		result.add(REJECT_CAB);
		result.add(APPOINTMENT_CANCELLED);
		result.add(APPOINTMENT_BOOKED);
		result.add(CANCELLED_PENDING_APPT);
		result.add(PATIENTCANCELLED);
		result.add(HOSPITALCANCELLED);
		result.add(CANCEL_PROVISIONAL);
		result.add(CAB_CANCEL_REQ);
		result.add(CANCELLATIONCONFIRMATION);
		result.add(DNA);
		result.add(CLOSED);
		result.add(ARRIVAL);
		result.add(SEEN);
		result.add(ACTIONCOMPLETE);
		result.add(ACTIONINCOMPLETE);
		result.add(BLOCKED);
		result.add(BOOKED);
		result.add(ADMITTED);
		result.add(DATA_CORRECTED);
		result.add(SUSPENDED);
		result.add(MEETING);
		result.add(LUNCH);
		result.add(GONEOUT);
		result.add(BREAK);
		result.add(HOLIDAY);
		result.add(OTHER);
		result.add(APPOINTMENTMOVED);
		result.add(DISCHARGED);
		return result;
	}
	public static Status_Reason[] getNegativeInstances()
	{
		Status_Reason[] instances = new Status_Reason[34];
		instances[0] = PROVISIONAL;
		instances[1] = CONFIRM_RECEIVED;
		instances[2] = SLOTOPENED;
		instances[3] = UNCANCEL_RECEIVED;
		instances[4] = DEALLOCATED;
		instances[5] = CANCELLED;
		instances[6] = REJECT_CAB;
		instances[7] = APPOINTMENT_CANCELLED;
		instances[8] = APPOINTMENT_BOOKED;
		instances[9] = CANCELLED_PENDING_APPT;
		instances[10] = PATIENTCANCELLED;
		instances[11] = HOSPITALCANCELLED;
		instances[12] = CANCEL_PROVISIONAL;
		instances[13] = CAB_CANCEL_REQ;
		instances[14] = CANCELLATIONCONFIRMATION;
		instances[15] = DNA;
		instances[16] = CLOSED;
		instances[17] = ARRIVAL;
		instances[18] = SEEN;
		instances[19] = ACTIONCOMPLETE;
		instances[20] = ACTIONINCOMPLETE;
		instances[21] = BLOCKED;
		instances[22] = BOOKED;
		instances[23] = ADMITTED;
		instances[24] = DATA_CORRECTED;
		instances[25] = SUSPENDED;
		instances[26] = MEETING;
		instances[27] = LUNCH;
		instances[28] = GONEOUT;
		instances[29] = BREAK;
		instances[30] = HOLIDAY;
		instances[31] = OTHER;
		instances[32] = APPOINTMENTMOVED;
		instances[33] = DISCHARGED;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[34];
		negativeInstances[0] = "PROVISIONAL";
		negativeInstances[1] = "CONFIRM_RECEIVED";
		negativeInstances[2] = "SLOTOPENED";
		negativeInstances[3] = "UNCANCEL_RECEIVED";
		negativeInstances[4] = "DEALLOCATED";
		negativeInstances[5] = "CANCELLED";
		negativeInstances[6] = "REJECT_CAB";
		negativeInstances[7] = "APPOINTMENT_CANCELLED";
		negativeInstances[8] = "APPOINTMENT_BOOKED";
		negativeInstances[9] = "CANCELLED_PENDING_APPT";
		negativeInstances[10] = "PATIENTCANCELLED";
		negativeInstances[11] = "HOSPITALCANCELLED";
		negativeInstances[12] = "CANCEL_PROVISIONAL";
		negativeInstances[13] = "CAB_CANCEL_REQ";
		negativeInstances[14] = "CANCELLATIONCONFIRMATION";
		negativeInstances[15] = "DNA";
		negativeInstances[16] = "CLOSED";
		negativeInstances[17] = "ARRIVAL";
		negativeInstances[18] = "SEEN";
		negativeInstances[19] = "ACTIONCOMPLETE";
		negativeInstances[20] = "ACTIONINCOMPLETE";
		negativeInstances[21] = "BLOCKED";
		negativeInstances[22] = "BOOKED";
		negativeInstances[23] = "ADMITTED";
		negativeInstances[24] = "DATA_CORRECTED";
		negativeInstances[25] = "SUSPENDED";
		negativeInstances[26] = "MEETING";
		negativeInstances[27] = "LUNCH";
		negativeInstances[28] = "GONEOUT";
		negativeInstances[29] = "BREAK";
		negativeInstances[30] = "HOLIDAY";
		negativeInstances[31] = "OTHER";
		negativeInstances[32] = "APPOINTMENTMOVED";
		negativeInstances[33] = "DISCHARGED";
		return negativeInstances;
	}
	public static Status_Reason getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static Status_Reason getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		Status_Reason[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1141007;
	public static final Status_Reason PROVISIONAL = new Status_Reason(-566, "Provisional", true, null, null, Color.Default);
	public static final Status_Reason CONFIRM_RECEIVED = new Status_Reason(-1456, "Confirmation Received (CAB)", true, Status_Reason.PROVISIONAL, null, Color.Default);
	public static final Status_Reason SLOTOPENED = new Status_Reason(-567, "Open", true, null, null, Color.Default);
	public static final Status_Reason UNCANCEL_RECEIVED = new Status_Reason(-573, "Cancellation Request was Reversed", true, Status_Reason.SLOTOPENED, null, Color.Default);
	public static final Status_Reason DEALLOCATED = new Status_Reason(-630, "Deallocated - PAS Only Type", true, Status_Reason.SLOTOPENED, null, Color.Default);
	public static final Status_Reason CANCELLED = new Status_Reason(-568, "Cancelled", true, null, null, Color.Default);
	public static final Status_Reason REJECT_CAB = new Status_Reason(-569, "Reject received from Choose And Book", true, Status_Reason.CANCELLED, null, Color.Default);
	public static final Status_Reason APPOINTMENT_CANCELLED = new Status_Reason(-612, "Appointment Cancelled", true, Status_Reason.CANCELLED, null, Color.Default);
	public static final Status_Reason APPOINTMENT_BOOKED = new Status_Reason(-613, "Booked", true, Status_Reason.CANCELLED, null, Color.Default);
	public static final Status_Reason CANCELLED_PENDING_APPT = new Status_Reason(-614, "Cancelled Pending Appointment", true, Status_Reason.CANCELLED, null, Color.Default);
	public static final Status_Reason PATIENTCANCELLED = new Status_Reason(-1445, "Patient Cancelled", true, Status_Reason.CANCELLED, null, Color.Default);
	public static final Status_Reason HOSPITALCANCELLED = new Status_Reason(-1446, "Provider Cancelled", true, Status_Reason.CANCELLED, null, Color.Default);
	public static final Status_Reason CANCEL_PROVISIONAL = new Status_Reason(-584, "Provisionally Cancelled", true, null, null, Color.Default);
	public static final Status_Reason CAB_CANCEL_REQ = new Status_Reason(-571, "Cancellation Request from CAB", true, Status_Reason.CANCEL_PROVISIONAL, null, Color.Default);
	public static final Status_Reason CANCELLATIONCONFIRMATION = new Status_Reason(-1457, "Cancellation Provisional confirmed by CAB", true, Status_Reason.CANCEL_PROVISIONAL, null, Color.Default);
	public static final Status_Reason DNA = new Status_Reason(-587, "DNA", true, null, null, Color.Default);
	public static final Status_Reason CLOSED = new Status_Reason(-622, "Closed", true, null, null, Color.Default);
	public static final Status_Reason ARRIVAL = new Status_Reason(-1407, "Arrival", true, null, null, Color.Default);
	public static final Status_Reason SEEN = new Status_Reason(-1408, "Seen", true, null, null, Color.Default);
	public static final Status_Reason ACTIONCOMPLETE = new Status_Reason(-1409, "Action Complete", true, null, null, Color.Default);
	public static final Status_Reason ACTIONINCOMPLETE = new Status_Reason(-1410, "Action Incomplete", true, null, null, Color.Default);
	public static final Status_Reason BLOCKED = new Status_Reason(-1454, "Blocked", true, null, null, Color.Default);
	public static final Status_Reason BOOKED = new Status_Reason(-1469, "Booked", true, null, null, Color.Default);
	public static final Status_Reason ADMITTED = new Status_Reason(-1810, "Admitted", true, null, null, Color.Default);
	public static final Status_Reason DATA_CORRECTED = new Status_Reason(-2023, "DATA CORRECTED", true, null, null, Color.Default);
	public static final Status_Reason SUSPENDED = new Status_Reason(-2167, "Suspended", true, null, new ims.framework.utils.ImagePath(114133, "Images/Scheduling/threads_lock_24.png"), Color.Default);
	public static final Status_Reason MEETING = new Status_Reason(-2168, "Meeting", true, Status_Reason.SUSPENDED, null, Color.Default);
	public static final Status_Reason LUNCH = new Status_Reason(-2169, "Lunch", true, Status_Reason.SUSPENDED, null, Color.Default);
	public static final Status_Reason GONEOUT = new Status_Reason(-2170, "Gone Out", true, Status_Reason.SUSPENDED, null, Color.Default);
	public static final Status_Reason BREAK = new Status_Reason(-2171, "Break", true, Status_Reason.SUSPENDED, null, Color.Default);
	public static final Status_Reason HOLIDAY = new Status_Reason(-2172, "Holiday", true, Status_Reason.SUSPENDED, null, Color.Default);
	public static final Status_Reason OTHER = new Status_Reason(-2173, "Other", true, Status_Reason.SUSPENDED, null, Color.Default);
	public static final Status_Reason APPOINTMENTMOVED = new Status_Reason(-2174, "Appointment Moved", true, null, null, Color.Default);
	public static final Status_Reason DISCHARGED = new Status_Reason(-2630, "Discharged", true, null, null, Color.Default);
}
