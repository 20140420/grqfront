package com.grq.model.dao.impl;

import org.springframework.stereotype.Repository;

import com.grq.model.dao.UploadFileDao;
import com.lyq.model.product.UploadFile;

import com.grq.model.dao.impl.DaoSupport;

@Repository("uploadFileDao")
public class UploadFileDaoImpl extends DaoSupport<UploadFile> implements UploadFileDao {

}
