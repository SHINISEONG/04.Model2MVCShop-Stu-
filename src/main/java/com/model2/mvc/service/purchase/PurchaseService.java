package com.model2.mvc.service.purchase;

import java.util.HashMap;
import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Purchase;

public interface PurchaseService {
	public void addPurchase(Purchase purchase) throws Exception;
	public Purchase getPerchase(int tranNo) throws Exception;
	public Map<String, Object> getPurchaseList(Search search, String userId) throws Exception;
	public HashMap<String, Object> getSaleList(Search search) throws Exception;
	public void updatePurchase(Purchase purchase) throws Exception;
	public void updateTranCode(Purchase purchase) throws Exception;
	public int getTotalCount(String userId) throws Exception;
}