package com.grq.controller.action;

import com.grq.model.PageModel;

import com.lyq.model.product.ProductInfo;

/**
 * ��ƷAction
 * @author JiangQuan
 */
public class ProductAction extends BaseAction  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * �����Ʒ
	 */
	@Override
	public String add() throws Exception {
		//createCategoryTree();
		return INPUT;//���غ�̨��Ʒ���ҳ��
	}
	
	public String save() throws Exception {
		return list();//���غ�̨��Ʒ�б�ҳ��
	}
	/**
	 * ������Ʒ
	 * @return
	 * @throws Exception
	 
	public String save() throws Exception{
		if(file != null ){//����ļ�·����Ϊ��
			//��ȡ�������ľ���·��
			String path = ServletActionContext.getServletContext().getRealPath("/upload");
			File dir = new File(path);
			if(!dir.exists()){//����ļ��в�����
				dir.mkdir();//�����ļ���
			}
			String fileName = StringUitl.getStringTime() + ".jpg";//�Զ���ͼƬ����
			FileInputStream fis = null;//������
			FileOutputStream fos = null;//�����
			try {
				fis = new FileInputStream(file);//�����ϴ��ļ�����InputStreamʵ��
				fos = new FileOutputStream(new File(dir,fileName)); //����д���������ַ�����������
				byte[] bs = new byte[1024 * 4]; //�����ֽ�����ʵ��
				int len = -1;
				while((len = fis.read(bs)) != -1){//ѭ����ȡ�ļ�
					fos.write(bs, 0, len);//��ָ�����ļ�����д����
				}
				UploadFile uploadFile = new UploadFile();//ʵ��������
				uploadFile.setPath(fileName);//�����ļ�����
				product.setUploadFile(uploadFile);//�����ϴ�·��
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				fos.flush();
				fos.close();
				fis.close();
			}
		}
		//�����Ʒ������Ʒ���ID��Ϊ�գ��򱣴���Ʒ�����Ϣ
		if(product.getCategory() != null && product.getCategory().getId() != null){
			product.setCategory(categoryDao.load(product.getCategory().getId()));
		}
		//����ϴ��ļ����ϴ��ļ�ID��Ϊ�գ��򱣴��ļ����ϴ�·����Ϣ
		if(product.getUploadFile() != null && product.getUploadFile().getId() != null){
			product.setUploadFile(uploadFileDao.load(product.getUploadFile().getId()));
		}
		productDao.saveOrUpdate(product);//������Ʒ��Ϣ
		return list();
	}*/
	/**
	 * ��ѯ��Ʒ
	 * @return
	 * @throws Exception
	 */
	public String list() throws Exception{
		System.out.println("������ProductAction�ļ�save");
		pageModel = productDao.find(pageNo, pageSize);//���ù����Ĳ�ѯ����
		return LIST;//���غ�̨��Ʒ�б�ҳ��
	}
	
	
	




	// ��ҳ���
	private PageModel<ProductInfo> pageModel;
	
	
	
	public PageModel<ProductInfo> getPageModel() {
		return pageModel;
	}

	public void setPageModel(PageModel<ProductInfo> pageModel) {
		this.pageModel = pageModel;
	}	
	
}
