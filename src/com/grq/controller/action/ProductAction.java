package com.grq.controller.action;

import com.grq.model.PageModel;

import com.lyq.model.product.ProductInfo;

/**
 * 商品Action
 * @author JiangQuan
 */
public class ProductAction extends BaseAction  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * 添加商品
	 */
	@Override
	public String add() throws Exception {
		//createCategoryTree();
		return INPUT;//返回后台商品添加页面
	}
	
	public String save() throws Exception {
		return list();//返回后台商品列表页面
	}
	/**
	 * 保存商品
	 * @return
	 * @throws Exception
	 
	public String save() throws Exception{
		if(file != null ){//如果文件路径不为空
			//获取服务器的绝对路径
			String path = ServletActionContext.getServletContext().getRealPath("/upload");
			File dir = new File(path);
			if(!dir.exists()){//如果文件夹不存在
				dir.mkdir();//创建文件夹
			}
			String fileName = StringUitl.getStringTime() + ".jpg";//自定义图片名称
			FileInputStream fis = null;//输入流
			FileOutputStream fos = null;//输出流
			try {
				fis = new FileInputStream(file);//根据上传文件创建InputStream实例
				fos = new FileOutputStream(new File(dir,fileName)); //创建写入服务器地址的输出流对象
				byte[] bs = new byte[1024 * 4]; //创建字节数组实例
				int len = -1;
				while((len = fis.read(bs)) != -1){//循环读取文件
					fos.write(bs, 0, len);//向指定的文件夹中写数据
				}
				UploadFile uploadFile = new UploadFile();//实例化对象
				uploadFile.setPath(fileName);//设置文件名称
				product.setUploadFile(uploadFile);//设置上传路径
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				fos.flush();
				fos.close();
				fis.close();
			}
		}
		//如果商品类别和商品类别ID不为空，则保存商品类别信息
		if(product.getCategory() != null && product.getCategory().getId() != null){
			product.setCategory(categoryDao.load(product.getCategory().getId()));
		}
		//如果上传文件和上传文件ID不为空，则保存文件的上传路径信息
		if(product.getUploadFile() != null && product.getUploadFile().getId() != null){
			product.setUploadFile(uploadFileDao.load(product.getUploadFile().getId()));
		}
		productDao.saveOrUpdate(product);//保存商品信息
		return list();
	}*/
	/**
	 * 查询商品
	 * @return
	 * @throws Exception
	 */
	public String list() throws Exception{
		System.out.println("这里是ProductAction文件save");
		pageModel = productDao.find(pageNo, pageSize);//调用公共的查询方法
		return LIST;//返回后台商品列表页面
	}
	
	
	




	// 分页组件
	private PageModel<ProductInfo> pageModel;
	
	
	
	public PageModel<ProductInfo> getPageModel() {
		return pageModel;
	}

	public void setPageModel(PageModel<ProductInfo> pageModel) {
		this.pageModel = pageModel;
	}	
	
}
