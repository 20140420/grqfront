package com.grq.controller.action;

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
		System.out.println("������ProductAction�ļ�");
		//createCategoryTree();
		return INPUT;//���غ�̨��Ʒ���ҳ��
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
	@Override
	public String list() throws Exception{
		//pageModel = productDao.find(pageNo, pageSize);//���ù����Ĳ�ѯ����
		return LIST;//���غ�̨��Ʒ�б�ҳ��
	}
}
