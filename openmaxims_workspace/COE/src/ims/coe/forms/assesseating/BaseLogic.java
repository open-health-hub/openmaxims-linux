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

package ims.coe.forms.assesseating;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.coe.domain.AssessEating.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.coe.domain.AssessEating domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncomboBoxAppetiteValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.container1().comboBoxAppetite().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.coe.vo.lookups.DescribeAppetite existingInstance = (ims.coe.vo.lookups.DescribeAppetite)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcomboBoxAppetiteLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.coe.vo.lookups.DescribeAppetite)
		{
			ims.coe.vo.lookups.DescribeAppetite instance = (ims.coe.vo.lookups.DescribeAppetite)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcomboBoxAppetiteLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.coe.vo.lookups.DescribeAppetite existingInstance = (ims.coe.vo.lookups.DescribeAppetite)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.container1().comboBoxAppetite().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcomboBoxAppetiteLookup()
	{
		this.form.container1().comboBoxAppetite().clear();
		ims.coe.vo.lookups.DescribeAppetiteCollection lookupCollection = ims.coe.vo.lookups.LookupHelper.getDescribeAppetite(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.container1().comboBoxAppetite().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcomboBoxAppetiteLookupValue(int id)
	{
		ims.coe.vo.lookups.DescribeAppetite instance = ims.coe.vo.lookups.LookupHelper.getDescribeAppetiteInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.container1().comboBoxAppetite().setValue(instance);
	}
	protected final void defaultcomboBoxAppetiteLookupValue()
	{
		this.form.container1().comboBoxAppetite().setValue((ims.coe.vo.lookups.DescribeAppetite)domain.getLookupService().getDefaultInstance(ims.coe.vo.lookups.DescribeAppetite.class, engine.getFormName().getID(), ims.coe.vo.lookups.DescribeAppetite.TYPE_ID));
	}
	protected final void onanswerBoxSpecialDietValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.container1().answerBoxSpecialDiet().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNoUnknown existingInstance = (ims.core.vo.lookups.YesNoUnknown)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindanswerBoxSpecialDietLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.YesNoUnknown)
		{
			ims.core.vo.lookups.YesNoUnknown instance = (ims.core.vo.lookups.YesNoUnknown)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindanswerBoxSpecialDietLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNoUnknown existingInstance = (ims.core.vo.lookups.YesNoUnknown)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.container1().answerBoxSpecialDiet().addOption(instance);
		}
	}
	protected final void bindanswerBoxSpecialDietLookup()
	{
		this.form.container1().answerBoxSpecialDiet().clear();
		ims.core.vo.lookups.YesNoUnknownCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getYesNoUnknown(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.container1().answerBoxSpecialDiet().addOption(lookupCollection.get(x));
		}
	}
	protected final void defaultanswerBoxSpecialDietLookupValue()
	{
		this.form.container1().answerBoxSpecialDiet().setValue((ims.core.vo.lookups.YesNoUnknown)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.YesNoUnknown.class, engine.getFormName().getID(), ims.core.vo.lookups.YesNoUnknown.TYPE_ID));
	}
	protected final void onanswerBoxRequireAssistanceValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.container1().answerBoxRequireAssistance().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNoUnknown existingInstance = (ims.core.vo.lookups.YesNoUnknown)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindanswerBoxRequireAssistanceLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.YesNoUnknown)
		{
			ims.core.vo.lookups.YesNoUnknown instance = (ims.core.vo.lookups.YesNoUnknown)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindanswerBoxRequireAssistanceLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNoUnknown existingInstance = (ims.core.vo.lookups.YesNoUnknown)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.container1().answerBoxRequireAssistance().addOption(instance);
		}
	}
	protected final void bindanswerBoxRequireAssistanceLookup()
	{
		this.form.container1().answerBoxRequireAssistance().clear();
		ims.core.vo.lookups.YesNoUnknownCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getYesNoUnknown(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.container1().answerBoxRequireAssistance().addOption(lookupCollection.get(x));
		}
	}
	protected final void defaultanswerBoxRequireAssistanceLookupValue()
	{
		this.form.container1().answerBoxRequireAssistance().setValue((ims.core.vo.lookups.YesNoUnknown)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.YesNoUnknown.class, engine.getFormName().getID(), ims.core.vo.lookups.YesNoUnknown.TYPE_ID));
	}
	protected final void onanswerBoxDifficultySwallowingValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.container1().answerBoxDifficultySwallowing().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNoUnknown existingInstance = (ims.core.vo.lookups.YesNoUnknown)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindanswerBoxDifficultySwallowingLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.YesNoUnknown)
		{
			ims.core.vo.lookups.YesNoUnknown instance = (ims.core.vo.lookups.YesNoUnknown)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindanswerBoxDifficultySwallowingLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNoUnknown existingInstance = (ims.core.vo.lookups.YesNoUnknown)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.container1().answerBoxDifficultySwallowing().addOption(instance);
		}
	}
	protected final void bindanswerBoxDifficultySwallowingLookup()
	{
		this.form.container1().answerBoxDifficultySwallowing().clear();
		ims.core.vo.lookups.YesNoUnknownCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getYesNoUnknown(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.container1().answerBoxDifficultySwallowing().addOption(lookupCollection.get(x));
		}
	}
	protected final void defaultanswerBoxDifficultySwallowingLookupValue()
	{
		this.form.container1().answerBoxDifficultySwallowing().setValue((ims.core.vo.lookups.YesNoUnknown)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.YesNoUnknown.class, engine.getFormName().getID(), ims.core.vo.lookups.YesNoUnknown.TYPE_ID));
	}
	protected final void oncomboBoxDietValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.container1().comboBoxDiet().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.nursing.vo.lookups.SpecialDiet existingInstance = (ims.nursing.vo.lookups.SpecialDiet)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcomboBoxDietLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.nursing.vo.lookups.SpecialDiet)
		{
			ims.nursing.vo.lookups.SpecialDiet instance = (ims.nursing.vo.lookups.SpecialDiet)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcomboBoxDietLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.nursing.vo.lookups.SpecialDiet existingInstance = (ims.nursing.vo.lookups.SpecialDiet)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.container1().comboBoxDiet().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcomboBoxDietLookup()
	{
		this.form.container1().comboBoxDiet().clear();
		ims.nursing.vo.lookups.SpecialDietCollection lookupCollection = ims.nursing.vo.lookups.LookupHelper.getSpecialDiet(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.container1().comboBoxDiet().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcomboBoxDietLookupValue(int id)
	{
		ims.nursing.vo.lookups.SpecialDiet instance = ims.nursing.vo.lookups.LookupHelper.getSpecialDietInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.container1().comboBoxDiet().setValue(instance);
	}
	protected final void defaultcomboBoxDietLookupValue()
	{
		this.form.container1().comboBoxDiet().setValue((ims.nursing.vo.lookups.SpecialDiet)domain.getLookupService().getDefaultInstance(ims.nursing.vo.lookups.SpecialDiet.class, engine.getFormName().getID(), ims.nursing.vo.lookups.SpecialDiet.TYPE_ID));
	}
	protected final void bindgridSwallowColStatusLookup()
	{
		this.form.container1().gridSwallow().answerBoxColumnClear(1);
		ims.core.vo.lookups.YesNoUnknownCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getYesNoUnknown(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.container1().gridSwallow().answerBoxColumnNewOption(1, lookupCollection.get(x));
		}
	}
	protected final void bindgridOralColStatusLookup()
	{
		this.form.container1().gridOral().answerBoxColumnClear(1);
		ims.core.vo.lookups.YesNoUnknownCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getYesNoUnknown(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.container1().gridOral().answerBoxColumnNewOption(1, lookupCollection.get(x));
		}
	}
	protected final void bindgridDexerityColStatusLookup()
	{
		this.form.container1().gridDexerity().answerBoxColumnClear(1);
		ims.core.vo.lookups.YesNoUnknownCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getYesNoUnknown(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.container1().gridDexerity().answerBoxColumnNewOption(1, lookupCollection.get(x));
		}
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.coe.domain.AssessEating domain;
}
