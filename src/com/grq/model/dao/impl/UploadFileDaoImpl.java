package com.grq.model.dao.impl;

import org.springframework.stereotype.Repository;

import com.grq.model.dao.UploadFileDao;

import com.grq.model.dao.impl.DaoSupport;
import com.grq.model.pojo.product.UploadFile;

@Repository("uploadFileDao")
public class UploadFileDaoImpl extends DaoSupport<UploadFile> implements UploadFileDao {

}
