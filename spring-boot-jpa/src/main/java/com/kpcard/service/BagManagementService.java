package com.kpcard.service;

import java.util.List;

import com.kpcard.jpa.bag.Bag;
import com.kpcard.jpa.bag.BagSummary;

public interface BagManagementService {
	
	public Bag CreateBag(Bag bag);
	
	public Bag ReadBag(String bagId);
	
	public Bag UpdateBag(String bagId, Bag bag);
	
	public boolean DeleteBag(String bagId);
	
	public List<BagSummary> QueryBagsByIds(String bagIds);
	
	public List<BagSummary> QueryBagsByCriteria(
			int first,
			int maximum,
			String sortKey,
			boolean ascending,
			boolean exactMatch,
			boolean caseSensitive);
	
	public List<BagSummary> QueryBagsByOwner(
			String ownerId,
			int first,
			int maximum,
			String sortKey,
			boolean ascending);
	
	public int QueryCountOfCardsByProductLine(String productLineId, String companyId);
	
	public boolean RegiftCardsForBag(String bagIdOrigin, String bagIdDestination, String[] cardIds);
}
