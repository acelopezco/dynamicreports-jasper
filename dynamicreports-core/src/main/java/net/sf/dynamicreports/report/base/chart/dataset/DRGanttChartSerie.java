/**
 * DynamicReports - Free Java reporting library for creating reports dynamically
 *
 * Copyright (C) 2010 - 2015 Ricardo Mariaca
 * http://www.dynamicreports.org
 *
 * This file is part of DynamicReports.
 *
 * DynamicReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DynamicReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with DynamicReports. If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.dynamicreports.report.base.chart.dataset;

import net.sf.dynamicreports.report.constant.Constants;
import net.sf.dynamicreports.report.definition.chart.dataset.DRIGanttChartSerie;
import net.sf.dynamicreports.report.definition.expression.DRIExpression;

/**
 * @author Ricardo Mariaca (r.mariaca@dynamicreports.org)
 */
public class DRGanttChartSerie extends AbstractChartSerie implements DRIGanttChartSerie {
	private static final long serialVersionUID = Constants.SERIAL_VERSION_UID;

	private DRIExpression<?> startDateExpression;
	private DRIExpression<?> endDateExpression;
	private DRIExpression<?> percentExpression;
	private DRIExpression<?> labelExpression;

	@Override
	public DRIExpression<?> getStartDateExpression() {
		return startDateExpression;
	}

	public void setStartDateExpression(DRIExpression<?> startDateExpression) {
		this.startDateExpression = startDateExpression;
	}

	@Override
	public DRIExpression<?> getEndDateExpression() {
		return endDateExpression;
	}

	public void setEndDateExpression(DRIExpression<?> endDateExpression) {
		this.endDateExpression = endDateExpression;
	}

	@Override
	public DRIExpression<?> getPercentExpression() {
		return percentExpression;
	}

	public void setPercentExpression(DRIExpression<?> percentExpression) {
		this.percentExpression = percentExpression;
	}

	@Override
	public DRIExpression<?> getLabelExpression() {
		return labelExpression;
	}

	public void setLabelExpression(DRIExpression<?> labelExpression) {
		this.labelExpression = labelExpression;
	}

}
