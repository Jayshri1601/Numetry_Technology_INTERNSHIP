package com.winable.stockinfo.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StockDetail {
	
		public StockDetail(int stockId, String stockName, float currentPrice) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.currentPrice = currentPrice;
	}
		private int stockId;
		private String stockName;
		private float currentPrice;
		
}
