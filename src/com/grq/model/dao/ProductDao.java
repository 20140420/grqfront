package com.grq.model.dao;

import java.util.List;

import com.grq.model.dao.BaseDao;
import com.grq.model.pojo.product.ProductInfo;

public interface ProductDao extends BaseDao<ProductInfo>{
	public List<ProductInfo> findCommend();//��ѯ�Ƽ���Ʒ
	public List<ProductInfo> findClickcount();//��ѯ�������
	public List<ProductInfo> findSellCount();//��ѯ��ѯ��������
}
