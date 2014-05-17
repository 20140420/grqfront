package com.grq.model.dao;

import java.util.List;

import com.grq.model.dao.BaseDao;
import com.grq.model.pojo.product.ProductInfo;

public interface ProductDao extends BaseDao<ProductInfo>{
	public List<ProductInfo> findCommend();//查询推荐商品
	public List<ProductInfo> findClickcount();//查询点击排名
	public List<ProductInfo> findSellCount();//查询查询人气排名
}
