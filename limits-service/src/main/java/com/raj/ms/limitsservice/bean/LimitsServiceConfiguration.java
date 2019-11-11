package com.raj.ms.limitsservice.bean;

public class LimitsServiceConfiguration {


	private int maxLimit;
	private int minLimit;

	public int getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}

	public int getMinLimit() {
		return minLimit;
	}

	public void setMinLimit(int minLimit) {
		this.minLimit = minLimit;
	}

	public LimitsServiceConfiguration()
	{}

	public LimitsServiceConfiguration(int max, int min)
	{
		this.maxLimit = max;
		this.minLimit = min;
	}

}
