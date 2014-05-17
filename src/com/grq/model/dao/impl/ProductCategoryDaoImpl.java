package com.grq.model.dao.impl;

import org.springframework.stereotype.Repository;

import com.grq.model.dao.ProductCategoryDao;
import com.grq.model.dao.impl.DaoSupport;
import com.lyq.model.product.ProductCategory;

@Repository("productCategoryDao")
public class ProductCategoryDaoImpl extends DaoSupport<ProductCategory> implements ProductCategoryDao {

}
