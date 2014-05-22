package com.grq.controller.action.product;


//import java.util.ArrayList;
//import java.util.List;

import com.grq.controller.action.BaseAction;
import com.grq.model.PageModel;
import com.grq.model.pojo.product.ProductCategory;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 商品类别Action对象
 * @author 姜泉
 *
 */

public class ProductCategoryAction extends BaseAction implements ModelDriven<ProductCategory>{
	private static final long serialVersionUID = 1L;
	private ProductCategory category = new ProductCategory();//一定要先初始化obj对象！
	// 父类别id
	private Integer pid;
	// 所有类别
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
	public ProductCategory getModel() {//此方法是Modeldriven接口的方法，要重写
		return category;
	}
	
	@Override
	public String add() throws Exception {
		if(pid != null && pid > 0 ){//如果有父节点
			//加载实体对象,基础继承hibernate模板的load();
			ProductCategory parent = categoryDao.load(pid);
			// 层次加1
			category.setLevel(parent.getLevel() + 1);
		}
		System.out.println("这里是ProductAction文件add1");
		return INPUT;
	}
	/**
	 * 添加类别
	 * @return
	 * @throws Exception
	 */
	public String save() throws Exception{
		if(pid != null && pid > 0 ){//如果有父节点
			category.setParent(categoryDao.load(pid));//设置其父节点
		}
		System.out.println("这里是ProductAction文件save1");
		categoryDao.saveOrUpdate(category);//添加类别信息
		System.out.println("这里是ProductAction文件save");
		return list();//返回类别列表的查找方法
	}
	/**
	 * 查询类别
	 * @return
	 * @throws Exception
	*/ 
	public String list() throws Exception{
		Object[] params = null;//对象数组为空
		String where;//查询条件变量
		if(pid != null && pid > 0 ){//如果有父节点
			where = "where parent.id =?";//执行查询条件
			params = new Integer[]{pid};//设置参数值
		}else{
			where = "where parent is null";//查询根节点
		}
		setPageModel(categoryDao.find(pageNo,pageSize,where,params));//执行封装的查询方法
		return LIST;//返回后台类别列表页面
	}

	/**
	 * 测试JSP页面iterator标签可行
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
		
		return LIST;//返回后台类别列表页面
	}
	*/
	
	/**
	 * 编辑类别
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
	 * 删除类别
	 * @return String
	 * @throws Exception
	 */
	public String del() throws Exception{
		if(category.getId() != null && category.getId() > 0){//判断是否获得ID参数
			categoryDao.delete(category.getId());//执行删除操作
		}
		return list();//返回商品类别列表的查找方法
	}


	
}
