package com.grq.controller.action.product;


//import java.util.ArrayList;
//import java.util.List;

import com.grq.controller.action.BaseAction;
import com.grq.model.PageModel;
import com.grq.model.pojo.product.ProductCategory;
import com.opensymphony.xwork2.ModelDriven;

/**
 * ��Ʒ���Action����
 * @author ��Ȫ
 *
 */

public class ProductCategoryAction extends BaseAction implements ModelDriven<ProductCategory>{
	private static final long serialVersionUID = 1L;
	private ProductCategory category = new ProductCategory();//һ��Ҫ�ȳ�ʼ��obj����
	// �����id
	private Integer pid;
	// �������
	private PageModel<ProductCategory> pageModel;
	//private List<ProductCategory> pageModel;
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public ProductCategory getCategory() {
		return category;
	}
	public void setCategory(ProductCategory category) {
		this.category = category;
	}
	/**
	 * 
	 * @return

	public List<ProductCategory> getPageModel() {
		return pageModel;
	}

	public void setPageModel(List<ProductCategory> pageModel) {
		this.pageModel = pageModel;
	}
	 */
/**
 * 
 * 
 */
	public PageModel<ProductCategory> getPageModel() {
		return pageModel;
	}

	public void setPageModel(PageModel<ProductCategory> pageModel) {
		this.pageModel = pageModel;
	}
	
	
	@Override
	public ProductCategory getModel() {//�˷�����Modeldriven�ӿڵķ�����Ҫ��д
		return category;
	}
	
	@Override
	public String add() throws Exception {
		if(pid != null && pid > 0 ){//����и��ڵ�
			//����ʵ�����,�����̳�hibernateģ���load();
			ProductCategory parent = categoryDao.load(pid);
			// ��μ�1
			category.setLevel(parent.getLevel() + 1);
		}
		System.out.println("������ProductAction�ļ�add1");
		return INPUT;
	}
	/**
	 * ������
	 * @return
	 * @throws Exception
	 */
	public String save() throws Exception{
		if(pid != null && pid > 0 ){//����и��ڵ�
			category.setParent(categoryDao.load(pid));//�����丸�ڵ�
		}
		System.out.println("������ProductAction�ļ�save1");
		categoryDao.saveOrUpdate(category);//��������Ϣ
		System.out.println("������ProductAction�ļ�save");
		return list();//��������б�Ĳ��ҷ���
	}
	/**
	 * ��ѯ���
	 * @return
	 * @throws Exception
	*/ 
	public String list() throws Exception{
		Object[] params = null;//��������Ϊ��
		String where;//��ѯ��������
		if(pid != null && pid > 0 ){//����и��ڵ�
			where = "where parent.id =?";//ִ�в�ѯ����
			params = new Integer[]{pid};//���ò���ֵ
		}else{
			where = "where parent is null";//��ѯ���ڵ�
		}
		setPageModel(categoryDao.find(pageNo,pageSize,where,params));//ִ�з�װ�Ĳ�ѯ����
		return LIST;//���غ�̨����б�ҳ��
	}

	/**
	 * ����JSPҳ��iterator��ǩ����
	 * @return
	 * @throws Exception

	public String list() throws Exception{

		pageModel =new ArrayList<ProductCategory>();
		
		ProductCategory category1 = new ProductCategory();
		category1.setId(1);
		category1.setLevel(1);
		category1.setName("leibie");
		category1.setParent(null);
		category1.setChildren(null);
		category1.setProducts(null);
		pageModel.add(category1);
		
		return LIST;//���غ�̨����б�ҳ��
	}
	*/
	
	/**
	 * �༭���
	 * @return String
	 * @throws Exception
	 */
	public String edit() throws Exception{
		if(category.getId() != null && category.getId() > 0){
			this.category = categoryDao.get(category.getId());
		}
		return EDIT;
	}
	/**
	 * ɾ�����
	 * @return String
	 * @throws Exception
	 */
	public String del() throws Exception{
		if(category.getId() != null && category.getId() > 0){//�ж��Ƿ���ID����
			categoryDao.delete(category.getId());//ִ��ɾ������
		}
		return list();//������Ʒ����б�Ĳ��ҷ���
	}


	
}
