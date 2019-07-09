/* 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.av.csv.calculator;

import java.text.DateFormatSymbols;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

/**
 * 
 * Extract month from a date.
 * 
 * @author ActiveViam
 *
 */
public class DateMonthCalculator extends ADateFieldCalculator {

	/** Month names */
	protected final String[] months;
	
	public DateMonthCalculator(String baseColumnName, String columnName) {
		super(baseColumnName, columnName);
	    DateFormatSymbols dfs = new DateFormatSymbols();
	    this.months = dfs.getMonths();
	}

	@Override
	protected Object compute(TemporalAccessor date) {
		return date.get(ChronoField.MONTH_OF_YEAR);
	}
	
}
