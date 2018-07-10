package com.example.ahuang.myframe.api;


/*
* Constant  2016-11-14
* Copyright (c) 2016 HYB Co.Ltd. All right reserved.
*/
/*
* 保存全工程的常量
* @author Borje
* @version 1.0.0
* since 2016-11-14
*/
public class Constant {
    public static boolean LOG_DEBUG = true; //控制工程的log信息打印

    public static final String base_url="https://ssrj.com";

    //测试
    public static final String url = "http://";
    //  public static final String url_miao="http://192.168.1.17";
    //   public static final String url_ding = "http://192.168.1.30:8080";

    public static final String url_miao = "https://ssrj.com";
    // public static final String url_miao = "https://a.ssrj.com";
    // public static final String url_miao = "https://login1.ssrj.com";
    // public static final String url_miao ="https://192.168.1.70";

    // https://ssrj.com
    //http://192.168.1.13
    public static final String url_ding = "https://ssrj.com/b82";
    // public static final String url_ding = "http://192.168.1.17:8080/ssrj-api/v5/index";
    // public static final String url_ding = "https://a.ssrj.com/b82";
    //  public static final String url_ding = "https://login1.ssrj.com/b82";
    //  public static final String url_ding = "https://b82.ssrj.com";
    // public static final String url_ding ="https://192.168.1.70/b82";
//  public static final String url_wen = "https://a.ssrj.com/b180";
    // public static final String url_wen_new = "https://a.ssrj.com/b180/api/v1";

    public static final String url_wen = "https://ssrj.com/b180";
    public static final String url_wen_new = "https://ssrj.com/b180/api/v1";
    public static final String url_wen_new_www = "https://ssrj.com/b180/api/v1";

    //public static final String url_wen = "https://login1.ssrj.com/b180";
    // public static final String url_wen_new = "https://login1.ssrj.com/b180/api/v1";

    public static final String url_public = "http://ssrj.com";

    public static final String APP_VERSION = "&appVersion=";
    public static final String TOKEN = "&token=";
    public static final String PAGEINDEX = "&pageIndex=";  //当前分页
    public static final String PAGESIZE = "&pageSize=";  //每页数据
    public static final String TIME_STRING = "&timeString="; //时间戳

    public static final String LOGIN_FROM = "login_from";  //标识从哪里跳进登录页面

    //生产
    //public static final String url="https";

    public static final String wx_appId = "wx71d644fc50bc3765"; //微信appId，支付用
    public static final String wx_appSecret = "e21c3a1db78495da17462f39c90d52f3";


    /**
     * QQ appid
     */
    public static final String qq_appId = "1105128997";
    public static final String qq_AppKey = "ZpsmYoqFTv7CnqNU";
    /**
     * 新浪微博id and  key
     */
    public static final String sina_appId = "2866004777";
    public static final String sina_AppKey = "2d674c28080ec8e9199e744deb3c1fc9";

    public static final String IS_BTN_SHOW = "is_btn_show";//加入合辑、点赞、关注开关
    public static final String BTN_VISIBILITY = "https://ssrj.com/b180/api/v1/state/inquire";

    /**
     * 查询在线app的版本信息
     */
    public static final String APP_VERSION_ONLINE = url_ding + "/api/v2/version/android";
    /**
     * 首页弹窗
     */
    public static final String HOME_POP_WINDOWS = url_miao + "/api/v5/activity/getHomePopActivty.jhtml?activityVersion=";
    /*******  首页  ******/
    /**
     * 查询首页接口
     */
    public static final String HOMEPAGE_VERSION = "http://ssrj.com/b82/api/v4/index/homeindex?appVersion=";
    public static final String HOMEPAGE_INDEX = "&pageIndex=";
    public static final String HOMEPAGE_TOKEN = "&pageSize=10&token=";
    public static final String HOMEPAGE_OTHER = "&useFor=app";

    //https://ssrj.com/b82/api/v5/index/homeindex?appVersion=2.2.0&pageIndex=1&pageSize=10&token=7b36988ae5519ddd8b5be1c99e3a0213&useFor=app
    /**
     * 查询首页接口 <新>
     */
    public static final String HOMEPAGE_VERSION_NEW = url_ding + "/api/v5/index/homeindex?appVersion=";

    /**
     * 首页--新品、折扣、品牌等跳转
     */
    public static final String SINGLE = url_miao + "/api/v5/product/list.jhtml?";
    public static final String SINGLE_CLASSIFY = "classifys=";
    public static final String SINGLE_BRANDS = "&brands=";
    public static final String SINGLE_UPTIME = "&upTime=";
    public static final String SINGLE_ORDER_STR = "&orderStr=";
    public static final String SINGLE_PROMOTION = "&isPromotion=";
    public static final String SINGLE_VERSION = "&appVersion=";
    public static final String SINGLE_START = "&start=";
    public static final String SINGLE_TAGDID = "&tagsId=";
    public static final String SINGLE_ROWS = "&rows=10";
    public static final String SINGLE_TOKEN = "&token=";

    /**
     * 根据不同业务类型对指定对象进行点赞 get
     * type: 点赞类型 goods:单品 9,collocation:搭配 2,inform:资讯 1,theme_item:合辑 4
     */
    //https://ssrj.com/b82/api/v5/thumb?type=&id=&token=&appVersion=
    public static final String THUMB = url_ding + "/api/v5/thumb?type=";
    public static final String THUMB_ID = "&id=";

    public static final String THUMB_NEW = url_wen + "/api/v1/sns/thumbsup/status/";

    public static final String THUMB_APP_VERSION = "&appVersion=";
    public static final String THUMB_TOKEN = "&token=";

    /**
     * 合辑详情
     */
    //https://ssrj.com/b82/api/v5/goods/findcollocationlist?pageIndex=1&pageSize=10&appVersion=3.0.0&thememItemId=1910
    public static final String COLLECTION_POSITION = url_ding + "/api/v5/goods/findcollocationlist?pageIndex=";
    public static final String COLLECTION_ID = "&pageSize=10&thememItemId=";
    public static final String COLLECTION_VERSION = "&appVersion=";
    public static final String COLLECTION_TOKEN = "&token=";

    /**
     * Looks详情
     */
    public static final String LOOKS_POSITION = url_ding + "/api/v5/goods/findcollocation?pageIndex=";
    public static final String LOOKS_ID = "&pageSize=10&colloctionId=";
    public static final String LOOKS_VERSION = "&appVersion=";
    public static final String LOOKS_TOKEN = "&token=";
    public static final String LOOKS = "7092";
    /**
     * 搭配详情，关注状态
     */
    public static final String LOOKS_ATTEN_STATUS_ID = url_wen_new_www + "/sns/subscribe/status/collocation/";
    public static final String LOOKS_ATTEN_STATUS_VERSION = "/author/?appVersion=";

    /**
     * 话题详情，关注状态
     */
    public static final String TOPIC_ATTEN_STATUS_ID = url_wen_new_www + "/sns/subscribe/status/theme_item/";
    public static final String TOPIC_ATTEN_STATUS_VERSION = "/author/?appVersion=";
    /**
     * Looks 搭配列表
     */
    public static final String LOOKS_LIST = url_public + "/api/v5/collocation/list.jhtml?token=da83e19a50a084522343d96746f0d889&pageNumber=1&type=3";
    public static final String LOOKS_LIST_TYPE = url + "ssrj.com/api/v5/collocation/list.jhtml?type=";
    public static final String LOOKS_LIST_TOKEN = "&token=";
    public static final String LOOKS_LIST_POSITION = "&pageNumber=";

    /**
     * 搭配列表显示
     */
    //https://ssrj.com/b180/api/v1/content/publish/collocation/list/order-chosen/
    public static final String LOOKS_LIST_NEW_TYPE = url_wen + "/api/v2/content/publish/collocation/list/";
    public static final String LOOKS_LIST_NEW_TOKEN = "/?token=";
    public static final String LOOKS_LIST_NEW_PAGE_INDEX = "&page_index=";
    public static final String LOOKS_LIST_NEW_PAGE_SIZE = "&page_size=";
    public static final String LOOKS_LIST_NEW_VERSION = "&appVersion=";


    /**
     * Collections 合辑列表
     */
    public static final String COLLECTIONS_LIST = "http://ssrj.com/b82/api/v5/goods/findGoodsThemeItem?type=3&pageIndex=0&appVersion=1.0&pageSize=10&token=da83e19a50a084522343d96746f0d889";
    public static final String COLLECTIONS_LIST_TYPE = url + "ssrj.com/b82/api/v5/goods/findGoodsThemeItem?type=";
    public static final String COLLECTIONS_LIST_TOKEN = "&token=";
    public static final String COLLECTIONS_LIST_POSITION = "&pageSize=10&pageIndex=";
    /**
     * 合辑列表
     */
    //content/publish/theme_item/list/order-chosen/
    public static final String COLLECTIONS_LIST_NEW_TYPE = url_wen + "/api/v2/content/publish/theme_item/list/";
    public static final String COLLECTIONS_LIST_NEW_TOKEN = "/?token=";
    public static final String COLLECTIONS_LIST_NEW_PAGE_INDEX = "&page_index=";
    public static final String COLLECTIONS_LIST_NEW_PAGE_SIZE = "&page_size=";
    public static final String COLLECTIONS_LIST_NEW_VERSION = "&appVersion=";

    /**
     * 单品详情
     */
    //https://ssrj.com/api/v5/product/view.jhtml?token=cd148e339eae1b31d69c006378f99e2f&appVersion=3.0&goodsId=1096
    // public static final String SINGLE_DETAIL = "http://www.ssrj.com/api/v4/product/view.jhtml?appVersion=1.0&token=227a1368bd09faa8f94d9181710ba533&goodsId=2048";
    public static final String SINGLE_DETAIL_VERSION = url_miao + "/api/v5/product/detail.jhtml?appVersion=";  //view 改成 detail
    public static final String SINGLE_DETAIL_TOKEN = "&token=";
    public static final String SINGLE_DETAIL = "&goodsId=";
    /**
     * 资讯列表
     */
    public static final String INFO_LIST = "http://ssrj.com/b82/api/v5/index/infromlist?pageIndex=0&pageSize=10&&token=da83e19a50a084522343d96746f0d889";
    public static final String INFO_LIST_VERSION = url_ding + "/api/v5/index/infromlist?appVersion=";
    public static final String INFO_LIST_POSITION = "&pageIndex=";
    public static final String INFO_LIST_TOKEN = "&pageSize=10&token=";

    /**
     * 搜索查询热词
     */
    public static final String QUERY_HOT_WORD = url_wen + "/api/v2/search/hotwords/?pagenum=0&pagesize=10&hotwordstype=0";
    /**
     * 查询个人搜索记录
     */
    //860311026589572
    public static final String QUERY_HISTROY = url_wen + "/api/v1/search/gethistory/?machineid=";
    /**
     * 提交个人搜索记录
     */
    //http://search.ssrj.com/api/v1/search/savehistory/?machineid=123456&searchkey=黑色 短裙
    public static final String COMMIT_HISTROY_ID = url_wen + "/api/v1/search/savehistory/?machineid=";
    public static final String COMMIT_HISTROY_KEY = "&searchkey=";
    /**
     * 清空搜索记录
     */
    //http://search.ssrj.com/api/v1/search/deletehistory/?machineid=test
    public static final String CLEAR_HISTROY = url_wen + "/api/v1/search/deletehistory/?machineid=";
    /**
     * 搜索列表
     */
    //http://search.ssrj.com/api/v2/search/hotwords/?pagenum=0&pagesize=2000&hotwordstype=1
    public static final String SEARCH_LIST_ALL = url_wen + "/api/v2/search/hotwords/?pagenum=0&pagesize=2000&hotwordstype=1";
    /**
     * 搜索详情，单品
     */
    //http://search.ssrj.com/api/v2/search/items/?pagenum=0&pagesize=10&search=织毛外套
    public static final String SEARCH_DEATIL_SINGLE_POSITION = url_wen + "/api/v2/search/items/?pagenum=";
    public static final String SEARCH_DEATIL_SINGLE_CONTENT = "&pagesize=10&search=";
    /**
     * 搜索详情，搭配
     */
    //http://search.ssrj.com/api/v2/search/collocation/?pagenum=0&pagesize=10&search=织毛外套
    public static final String SEARCH_DEATIL_LOOKS_POSITION = url_wen + "/api/v2/search/collocation/?pagenum=";
    public static final String SEARCH_DEATIL_LOOKS_CONTENT = "&pagesize=10&search=";
    /**
     * 搜索详情，搭配
     */
    //http://search.ssrj.com/api/v2/search/theme/?pagenum=0&pagesize=10&search=织毛外套
    public static final String SEARCH_DEATIL_COLLECTIONS_POSITION = url_wen + "/api/v2/search/theme/?pagenum=";
    public static final String SEARCH_DEATIL_COLLECTIONS_CONTENT = "&pagesize=10&search=";

    /**
     * 搜索资讯
     */
    //https://ssrj.com/b180/api/v1/solr/information?appVersion=3.1.0&pagenum=1&pagesize=10&search=%E6%AF%9B%E8%A1%A3&token=39455d2610dd11e6bc7a0050569b0ffc
    public static final String SEARCH_DEATIL_INFORM_VERSION = url_wen + "/api/v1/solr/information?appVersion=";
    public static final String SEARCH_DEATIL_INFORM_SEARCH = "&pagesize=10&search=";
    public static final String SEARCH_DEATIL_INFORM_PAGENUM = "&pagenum=";
    public static final String SEARCH_DEATIL_INFORM_TOKEN = "&token=";

    /**
     * 分享有礼
     */
    //https://ssrj.com/api/v2/member/share.jhtml?appVersion=&token=
    public static final String SHARE_GIFT_VERSION = url_miao + "/api/v5/member/share.jhtml?appVersion=";
    public static final String SHARE_GIFT_TOKEN = "&token=";

    /**
     * 单品集合展示列表接口
     */
    //https://ssrj.com/b82/api/v5/index/selectGoods?appVersion=3.1.0&pageIndex=1&pageSize=10&token=39455d2610dd11e6bc7a0050569b0ffc&useFor=app
    public static final String SINGLE_SHOW_LIST = url_ding + "/api/v5/index/selectGoods?useFor=app";
    /**
     * 加入合辑
     */
    //https://ssrj.com/b82/api/v3/goods/findcollocationwiththeme?pageIndex=1&pageSize=10&colloctionId=7766&appVersion=2.2.0&token=873344524fb4a6be8786a3b937157283
    public static final String JOIN_COLLECTION_LIST = url_ding + "/api/v3/goods/findcollocationwiththeme?pageIndex=";
    public static final String JOIN_COLLECTION_LIST_PAGE_SIZE = "&pageSize=";
    public static final String JOIN_COLLECTION_LIST_COLLOCTION_ID = "&colloctionId=";
    public static final String JOIN_COLLECTION_LIST_APP_VERSION = "&appVersion=";
    public static final String JOIN_COLLECTION_LIST_TOKEN = "&token=";

    /**
     * 获取已加入合辑
     */
    //https://b82.ssrj.com/api/v5/goods/findthemeitemtag?collocaltionId=18860&appVersion=3.1.0&token=3ebda71540f18f914264af19b9f931e8
    public static final String GET_THEME_TAG_LIST = url_ding + "/api/v5/goods/findthemeitemtag?collocaltionId=";
    public static final String GET_THEME_TAG_LIST_APP_VERSION = "&appVersion=";
    public static final String GET_THEME_TAG_LIST_TOKEN = "&token=";

    /**
     * 关联搭配和主题
     */
    //https://ssrj.com/b82/api//v3/goods/addthemeitemcollocation?themeItemId=&collocationId=&token=
    public static final String JOIN_COLLECTION = url_ding + "/api/v3/goods/addthemeitemcollocation?themeItemId=";
    public static final String JOIN_COLLECTION_COLLOCATION_ID = "&collocationId=";
    public static final String JOIN_COLLECTION_TOKEN = "&token=";

    /**
     * 创建主题(有关联ID)
     */
    //https://ssrj.com/b82/api/v3/goods/addthemeitem?name=&memo=&token=&isOpen=&collocationId=
    public static final String CREATE_COLLECTION = url_ding + "/api/v3/goods/addthemeitem?name=";
    public static final String CREATE_COLLECTION_MEMO = "&memo=";
    public static final String CREATE_COLLECTION_TOKEN = "&token=";
    public static final String CREATE_COLLECTION_IS_OPEN = "&isOpen=";
    public static final String CREATE_COLLECTION_COLLOCATION_ID = "&collocationId=";


    /**
     * 删除合辑 DELETE
     */
    //https://ssrj.com/b180/api/v1/content/publish/theme_item/detail/<pk>/
    public static final String DELETE_COLLECTION = url_wen + "/api/v1/content/publish/theme_item/detail/";

    /**
     * 删除搭配 DELETE
     */
    ///content/publish/collocation/detail/<pk>/
    public static final String DELETE_LOOK = url_wen + "/api/v1/content/publish/collocation/detail/";

    /**
     * 删除资讯 DELETE
     */
    ///content/publish/info/detail/<pk>/
    public static final String DELETE_INFORM = url_wen + "/api/v1/content/publish/inform/detail/";

//    /**
//     * 创建新合辑 POST
//     */
//    ///api/v1/collocationupload/createtheme/
//    public static final String CREATE_COLLECTIONS = url_wen + "/api/v1/collocationupload/createtheme/";
//    public static final String CREATE_COLLECTIONS_TITLE = "title";
//    public static final String CREATE_COLLECTIONS_BRIEF = "brief";
//    public static final String CREATE_COLLECTIONS_PUBLISH = "publish";
//    public static final String CREATE_COLLECTIONS_TOKEN = "token";
//    public static final String CREATE_COLLECTIONS_APPVERSION = "appVersion";
//
//    /**
//     * 编辑合辑 POST
//     */
//    ///content/publish/theme_item/detail/<pk>/
//    public static final String EDIT_COLLECTION = url_wen + "/api/v1/content/publish/theme_item/detail/";
//    public static final String EDIT_COLLECTION_NAME = "name";
//    public static final String EDIT_COLLECTION_MEMO = "memo";
//    public static final String EDIT_COLLECTION_TOKEN = "token";
//    public static final String EDIT_COLLECTION_VERSION = "appVersion";
//    public static final String EDIT_COLLECTION_IS_OPEN = "is_publish";
//    public static final String EDIT_COLLECTION_COLLOCATION_ID = "remove_collocation_id";

    /**
     * 筛选
     */
    //https://ssrj.com/b82/api/v2/product/findproductcategory?appVersion=2.2.0&classifys=28&token=e89bd013af9c87ecd8eff134be6db4ac
    public static final String FILTER = url_ding + "/api/v2/product/findproductcategory?appVersion=";
    public static final String FILTER_TOKEN = "&token=";

    /**
     * 首页轮播，第三种情况
     */
//    public static final String HOME_PAGE_BANNER_THREE = url_public + "/api/v5/event/nativeActivity.jhtml?id=";
    public static final String HOME_PAGE_BANNER_THREE = url_miao + "/api/v5/event/nativeActivity.jhtml?id=";

    /**---------------------------首页结束----------------------------------**/

    /*******  分类  ******/
    /**
     * 分类-分类
     */
    public static final String CLASSFY_CLASSFY = url_miao + "/api/v5/product/listProductCategory.jhtml";
    /**
     * 分类-品牌
     */
    public static final String CLASSFY_BRAND = url_public + "/api/v2/brand/listRecommend.jhtml";
    public static final String CLASSFY_BRAND_VERSION = url_miao + "/api/v5/brand/listRecommend.jhtml?appVersion=";
    public static final String CLASSFY_BRAND_TOKEN = "&token=";

    /**
     * 全部品牌
     */
    //https://ssrj.com/api/v2/brand/list.jhtml?token=xx
    public static final String CLASSIFY_MORE_BRANDS_ID = url_miao + "/api/v2/brand/list.jhtml?token=";
    public static final String CLASSIFY_MORE_BRANDS_VERSION = url_miao + "/api/v5/brand/list.jhtml?appVersion=";
    public static final String CLASSIFY_MORE_BRANDS_TOKEN = "&token=";

    /**
     * 单品子列表
     */
    //https://ssrj.com/api/v5/product/list.jhtml?appVersion=3.1.2&classifys=28&rows=30&start=0&token=3ebda71540f18f914264af19b9f931e8
    public static final String PRODUCT = url_miao + "/api/v5/product/list.jhtml?appVersion=";
    public static final String PRODUCT_CATEGORY = "&classifys=";
    public static final String PRODUCT_PAGENUM = "&start=";
    public static final String PRODUCT_PAGESIZE = "&rows=";
    public static final String PRODUCT_TOKEN = "&token=";

    /**
     * 素材子列表
     */
    //https://ssrj.com/b180/api/v1/collocation/stuff/?appVersion=3.1.2&category=1&pagenum=1&pagesize=30&token=3ebda71540f18f914264af19b9f931e8
    public static final String RESOURCE = url_wen_new + "/collocation/stuff/?appVersion=";
    public static final String RESOURCE_CATEGORY = "&category=";
    public static final String RESOURCE_PAGENUM = "&pagenum=";
    public static final String RESOURCE_PAGESIZE = "&pagesize=";
    public static final String RESOURCE_TOKEN = "&token=";

    /**
     * 品牌具体页面，顶部详情
     */
//    public static final String BRANDS_HEAD = url + "ssrj.com/api/v4/brand/view.jhtml?id=";
    public static final String BRANDS_HEAD = url_miao + "/api/v5/brand/view.jhtml?id=";
    public static final String BRANDS_TOKEN = "&token=";

    /**
     * 品牌具体页面，顶部详情
     */
    //https://ssrj.com/api/v5/brand/view.jhtml?id=78&appVersion=3.1.0&token=3ebda71540f18f914264af19b9f931e8
    public static final String BRANDS_HEAD_NEW = url_miao + "/api/v5/brand/view.jhtml?id=";
    public static final String BRANDS_APPVERSION_NEW = "&appVersion=";
    public static final String BRANDS_TOKEN_NEW = "&token=";

    /**
     * 品牌具体页面
     */
    //public static final String BRANDS="http://www.ssrj.com/api/v4/product/list.jhtml?&brands=78&appVersion=1.0&start=0&rows=10&token=227a1368bd09faa8f94d9181710ba533";
    //https://ssrj.com/api/v5/product/list.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&classifys=&colors=&prices=&brands=&cloths=&upTime=&orderStr=status=&tagsId=&categoryTag=&isPromotion=&start=0&rows=10
//    public static final String BRANDS = url_public + "/api/v5/product/list.jhtml?&appVersion=";
    public static final String BRANDS = url_miao + "/api/v5/product/list.jhtml?&appVersion=";
    public static final String BRANDS_ID = "&brands=";
    public static final String BRANDS_RDER_STR = "&orderStr=";
    public static final String BRANDS_ROW_TOKEN = "&rows=10&token=";
    public static final String BRANDS_START = "&start=";

    /**
     * 品牌具体页面,，发布
     */

    public static final String PUBLISH_POSITION = url_ding + "/api/v5/brand/findbranddynamic?pageIndex=";

    //https://ssrj.com/b82/api/v5/brand/findbranddynamic?appVersion=3.1.0&id=78&pageIndex=1&pageSize=10&token=3ebda71540f18f914264af19b9f931e8&type=brand&useFor=app
    public static final String PUBLISH_VERSION = "&appVersion=";
    public static final String PUBLISH_TOKEN = "&token=";
    public static final String PUBLISH_ID = "&pageSize=10&id=";
    public static final String PUBLISH_BRAND_ID = "&type=brand";
    /**
     * 品牌的发布主页增加接口：
     */
    // https://ssrj.com/b180/api/v2/content/publish/list/brand/<brand id>/?appVersion=xx&token=xxx&page_size=10&page_index=1，
    // 返回值、参数同api/v2/content/publish/list/user/<user id>/
    public static final String BRAND_PUBLISH = url_wen + "/api/v2/content/publish/list/brand/";
    public static final String BRAND_PUBLISH_VERSION = "?appVersion=";
    public static final String BRAND_PUBLISH_TOKEN = "&token=";
    public static final String BRAND_PUBLISH_PAGE_SIZE = "&page_size=";
    public static final String BRAND_PUBLISH_PAGE_INDEX = "&page_index=";
    /**
     * 品牌具体页面,，点赞
     */
    public static final String DIANZAN_POSITION = url_ding + "/api/v5/brand/findthumb?pageIndex=";
    public static final String DIANZAN_VERSION = "&appVersion=";
    public static final String DIANZAN_TOKEN = "&token=";
    public static final String DIANZAN_ID = "&pageSize=10&id=";
    public static final String DIANZAN_OTHER = "&type=brand";


    /**---------------------------分类结束----------------------------------**/


    /******* 场景  ******/

    /**
     * 购衣助手--场景
     */
    public static final String ASSISTANT_SIGHT = url_ding + "/api/v3/clad-aide/findfeatruescene";
    /**
     * 购衣助手--单品
     */
    public static final String ASSISTANT_SIGLE_ONE = "http://ssrj.com/b82/api/v3/clad-aide/find-goods?start=";
    public static final String ASSISTANT_SIGLE_TWO = "&rows=10&orderStr=";
    public static final String ASSISTANT_SIGLE_THREE = "&token=";
    public static final String ASSISTANT_SIGLE_SCENE = "&scene=";
    /**
     * 助手--搭配
     */
    public static final String ASSISTANT_ASSORT_ONE = url_ding + "/api/v5/clad-aide/find-collocations?start=";
    public static final String ASSISTANT_ASSORT_TWO = "&rows=10&token=";
    public static final String ASSISTANT_ASSORT_SCENE = "&scene=";

    /**
     * 购衣助手
     */
    //https://ssrj.com/b82/api/v5/clad-aide/find-goods?token=&skin=&heigth=&shape=&color=&unsuited=&style=&age=
    // &industry=&scene=&categoryTag=&brands=&colors=&prices=&orderStr=&start=&rows=
    /**
     * 最新orderStr=goodsOrder_desc
     * 价格升序orderStr=promotionPrice_asc
     * 价格降序orderStr=promotionPrice_desc
     * 默认进来就是orderStr=goodsOrder_desc
     * 热门orderStr=goodsOrder3_desc
     */
    public static final String ASSISTANT_SINGLE_NEW = url_ding + "/api/v5/clad-aide/find-goods?token=";
    public static final String ASSISTANT_SINGLE_NEW_CATEGORY_TAG = "&categoryTag=";
    public static final String ASSISTANT_SINGLE_NEW_BRANDS = "&brands=";
    public static final String ASSISTANT_SINGLE_NEW_COLORS = "&colors=";
    public static final String ASSISTANT_SINGLE_NEW_PRICES = "&prices=";
    public static final String ASSISTANT_SINGLE_NEW_ORDERSTR = "&orderStr=";
    public static final String ASSISTANT_SINGLE_NEW_SHAPE = "&shape=";
    public static final String ASSISTANT_SINGLE_NEW_COLOR = "&color=";
    public static final String ASSISTANT_SINGLE_NEW_STYLE = "&style=";
    public static final String ASSISTANT_SINGLE_NEW_START = "&start=";
    public static final String ASSISTANT_SINGLE_NEW_ROWS = "&rows=";

    /**
     * 颜色选择
     */
    //https://ssrj.com/b82/api/v3/goods/findfeatruegrouplist?quetionId=9&appVersion=2.2.0&token=c511e3c22126a7cea26606b21c070693
    public static final String COLOR_SELECT_VERSION = url_ding + "/api/v3/goods/findfeatruegrouplist?quetionId=9&appVersion=";
    public static final String COLOR_SELECT_TOKEN = "&token=";
    /**
     * 款式选择
     */
    //https://ssrj.com/b82/api/v3/goods/findfeatruegrouplist?quetionId=3&appVersion=2.2.0&token=c511e3c22126a7cea26606b21c070693
    public static final String PATTERN_SELECT_VERSION = url_ding + "/api/v3/goods/findfeatruegrouplist?quetionId=3&appVersion=";
    public static final String PATTERN_SELECT_TOKEN = "&token=";
    /**
     * 风格选择
     */
    //https://ssrj.com/b82/api/v3/goods/findfeatruegrouplist?quetionId=5&appVersion=2.2.0&token=c511e3c22126a7cea26606b21c070693
    public static final String STYLE_SELECT_VERSION = url_ding + "/api/v3/goods/findfeatruegrouplist?quetionId=5&appVersion=";
    public static final String STYLE_SELECT_TOKEN = "&token=";
    /**
     * 开启专属推荐
     */
    // https://ssrj.com/b82/api/v5/clad-aide/addfeatrueuser?appVersion=2.2.0&color=36%2C63&shape=8%2C58&style=20%2C21%2C19%2C25%2C62%2C23&token=da83e19a50a084522343d96746f0d889
    public static final String UNLOCK_YOUR_EXCLUSIVE_VERSION = url_ding + "/api/v5/clad-aide/addfeatrueuser?appVersion=";
    public static final String UNLOCK_YOUR_EXCLUSIVE_COLOR = "&color=";
    public static final String UNLOCK_YOUR_EXCLUSIVE_SHAPE = "&shape=";
    public static final String UNLOCK_YOUR_EXCLUSIVE_STYLE = "&style=";
    public static final String UNLOCK_YOUR_EXCLUSIVE_TOKEN = "&token=";


    /**---------------------------场景结束----------------------------------**/

    /*******  我的日记  ******/
    /**
     * 登录接口
     */
    public static final String LGGIN_ONE = url_miao + "/api/v5/login.jhtml?username=";
    public static final String LGGIN_TWO = "&password=";
    public static final String LGGIN_THREE = "&appVersion=";

    //  public static final String LOGIN_URL = "http://192.168.1.3:8000/api/v1/account/login/";
    public static final String LOGIN_URL = url_wen_new_www + "/account/login/";
    /**
     * 退出接口
     */
    public static final String LGGIN_OUT_VERSION = url_miao + "/api/v5/logout.jhtml?appVersion=";
    public static final String LGGIN_OUT_TOKEN = "&token=";

    /**
     * QQ登录前获得新的openid和unionId
     */
    //https://graph.qq.com/oauth2.0/me?access_token=65FACB5F067C60323EA096FD29C163FD&unionid=74E2903EAD2E7DA35A86A827C74B327D
    public static final String LGGIN_IN_QQ_NEW = "https://graph.qq.com/oauth2.0/me?access_token=";
    public static final String LGGIN_IN_QQ_NEW_UNION = "&unionid=";
    /**
     * 登录QQ登录
     */
//    public static final String LOGIN_BY_QQ = url_ding + "/api/v4/login/thirdparty/qqLoginPlugin";
//    public static final String LOGIN_BY_WECHAT = url_ding + "/api/v4/login/thirdparty/weixinLoginPlugin";
//    public static final String LOGIN_BY_SINA = url_ding + "/api/v4/login/thirdparty/weiboLoginPlugin";
    public static final String LOGIN_BY_QQ = url_miao + "/api/v5/login/thirdparty/qqLoginPlugin.jhtml";
    public static final String LOGIN_BY_WECHAT = url_miao + "/api/v5/login/thirdparty/weixinLoginPlugin.jhtml";
    public static final String LOGIN_BY_SINA = url_miao + "/api/v5/login/thirdparty/weiboLoginPlugin.jhtml";

    //文敬
//    public static final String LOGIN_QQ = " http://192.168.1.3:8000/api/v1/account/login/third-party/qq/";
//    public static final String LOGIN_WECHAT = " http://192.168.1.3:8000/api/v1/account/login/third-party/weixin/";
//    public static final String LOGIN_SINA = " http://192.168.1.3:8000/api/v1/account/login/third-party/weibo/";

    public static final String LOGIN_QQ = url_wen_new_www + "/account/login/third-party/qq/";
    public static final String LOGIN_WECHAT = url_wen_new_www + "/account/login/third-party/weixin/";
    public static final String LOGIN_SINA = url_wen_new_www + "/account/login/third-party/weibo/";
    /**
     * 获取验证码
     */
    public static final String GET_CODE_ONE = url_miao + "/api/v5/sms/sendSMSCode.jhtml?mobile=";
    public static final String GET_CODE_TWO = "&type=android&smsType=register";

    //文敬，获取短信验证码
    // public static final String GET_CODE_PHONE = "http://192.168.1.3:8000/api/v1/captcha/sms/";
    public static final String GET_CODE_PHONE = url_wen_new_www + "/captcha/sms/";

    //港澳台注册获取验证码
    //post请求 https://www.ssrj.com/api/v5/mail/sendMailCode.jhtml?appVersion=2.0.4&email=1650777972@qq.com&type=ios&smsType=register
    public static final String GET_REGISTER_CODE = url_miao + "/api/v5/mail/sendMailCode.jhtml";

    // public static final String GET_EMAIL_CODE = "http://192.168.1.3:8000/api/v1/captcha/email/";
    public static final String GET_EMAIL_CODE = url_wen_new_www + "/captcha/email/";

    //https://api.ssrj.com/api/v4/sms/sendSMSCode.jhtml?mobile=18310056969&type=ios&smsType=bind
    public static final String GET_CODE_MOBILE = url_miao + "/api/v5/sms/sendSMSCode.jhtml?mobile=";
    public static final String GET_CODE_TYPE = "&type=android&smsType=";
    /**
     * 查询绑定状态
     */
    //  public static final String GET_BIND_STATUS = "http://192.168.1.3:8000/api/v1/account/binding/status/?appVersion=";
    public static final String GET_BIND_STATUS = url_wen_new_www + "/account/binding/status/?appVersion=";
    /**
     * 第绑定
     */
//    public static final String BIND_MOBILE_QQ = url_ding + "/api/v4/login/bindle/qqLoginPlugin";
//    public static final String BIND_MOBILE_WECHAT = url_ding + "/api/v4/login/bindle/weixinLoginPlugin";
//    public static final String BIND_MOBILE_SINA = url_ding + "/api/v4/login/bindle/weiboLoginPlugin";
    public static final String BIND_MOBILE_THIRD = url_miao + "/api/v5/member/bindle.jhtml";

    //绑定
//    public static final String BIND_MOBILE_URL = "http://192.168.1.3:8000/api/v1/account/binding/mobile/";
//    public static final String BIND_EMAIL_URL = "http://192.168.1.3:8000/api/v1/account/binding/email/";
//    public static final String BIND_WECHAT_URL = "http://192.168.1.3:8000/api/v1/account/binding/weixin/";
//    public static final String BIND_QQ_URL = "http://192.168.1.3:8000/api/v1/account/binding/qq/";
//    public static final String BIND_WEIBO_URL = "http://192.168.1.3:8000/api/v1/account/binding/weibo/";

    public static final String BIND_MOBILE_URL = url_wen_new_www + "/account/binding/mobile/";
    public static final String BIND_EMAIL_URL = url_wen_new_www + "/account/binding/email/";
    public static final String BIND_WECHAT_URL = url_wen_new_www + "/account/binding/weixin/";
    public static final String BIND_QQ_URL = url_wen_new_www + "/account/binding/qq/";
    public static final String BIND_WEIBO_URL = url_wen_new_www + "/account/binding/weibo/";
    /**
     * 注册
     */
    public static final String REGISTER_ONE = url_miao + "/api/v5/register.jhtml?username=";
    public static final String REGISTER_TWO = "&password=";
    public static final String REGISTER_THREE = "&clientType=android&smsValite=";
    public static final String REGISTER_FOUR = "&mobile=";

    //  public static final String REGISTER_URL = "http://192.168.1.3:8000/api/v1/account/register/";
    public static final String REGISTER_URL = url_wen_new_www + "/account/register/";

    /**
     * 提交注册，post,Email
     */
    //https://www.ssrj.com/api/v5/register/mailRegister.jhtml?clientType=ios&username=邮箱账号&password=111&email=邮箱账号&smsValite=验证码   post
    public static final String REGISTER_EMAIL = url_miao + "/api/v5/register/mailRegister.jhtml";

    /**
     * 手机找回密码获取验证码
     */
    public static final String FIND_PASSWORD_PHONE_ONE = url_miao + "/api/v5/sms/sendSMSCode.jhtml?mobile=";
    public static final String FIND_PASSWORD_PHONE_TWO = "&type=android&smsType=findpassword";

    /**
     * 手机找回密码提交
     */
    public static final String FIND_PASSWORD_PHONE_COMMIT_ONE = url_miao + "/api/v5/password/find.jhtml?clientType=android&mobile=";
    public static final String FIND_PASSWORD_PHONE_COMMIT_TWO = "&code=";
    //手机重置密码前验证
    //  public static final String FIND_PASSWORD_PHONE_CHECK = "http://192.168.1.3:8000/api/v1/account/password_reset/check/";
    public static final String FIND_PASSWORD_PHONE_CHECK = url_wen_new_www + "/account/password_reset/check/";
    /**
     * 邮箱找回密码
     */
    public static final String FIND_PASSWORD_EMAIL = url_miao + "/api/v5/mail/sendMailCode.jhtml";
    /**
     * 邮箱提交信息，跳到密码重置界面
     */
    //https://ssrj.com/api/v5/password/checkEmaile.jhtml
    public static final String SUBBMIT_PASSWORD_EMAIL = url_miao + "/api/v5/password/checkEmaile.jhtml";
    /**
     * 重置密码https://ssrj.com/api/v5/password/resetPwd.jhtml
     */
    public static final String RESET_PASSWORD_CONFIRM = url_miao + "/api/v5/password/resetPwd.jhtml";
    //public static final String RESET_PASSWORD_CONFIRM_W = "http://192.168.1.3:8000/api/v1/account/password_reset/";
    public static final String RESET_PASSWORD_CONFIRM_W = url_wen_new_www + "/account/password_reset/";
    /**
     * 修改密码
     */
    //https://ssrj.com/api/v5/member/updatePassword.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&currentPassword=111111&password=111111
    public static final String MODIFY_PASSWORD_CONFIRM_VERSION = url_miao + "/api/v5/member/updatePassword.jhtml?appVersion=";
    public static final String MODIFY_PASSWORD_CONFIRM_TOKEN = "&token=";
    public static final String MODIFY_PASSWORD_CONFIRM_OLD = "&currentPassword=";
    public static final String MODIFY_PASSWORD_CONFIRM_NEW = "&password=";
    /**
     * 我的页面，查询个人信息
     */
    //新版 个人信息接口（包含微店信息）
    //https://ssrj.com/b180/api/v1/member/user_info/?appVersion=x&token=xxxx,
    public static final String QUERY_USER_INFO_E_SHOP = url_wen + "/api/v1/member/user_info/?appVersion=";
    public static final String QUERY_USER_INFO = url_miao + "/api/v5/member/index.jhtml?appVersion=";
    //  public static final String QUERY_USER_INFO = "http://api.ssrj.com/api/v5/member/index.jhtml?appVersion=";
    public static final String QUERY_USER_TOKEN = "&token=";
    /**
     * 查询我的-我的收藏
     */
    public static final String QUERY_USER_COLLECTION = url_ding + "/api/v3/goods/findfavoritecount?token=";

    /**
     * 我的订单，全部订单
     */
    public static final String MY_ORDER_ALL_ONE = url_miao + "/api/v5/member/order/list.jhtml?pageNumber=";
    public static final String MY_ORDER_ALL_TOKEN = "&token=";
    public static final String MY_ORDER_ALL_TWO = "&status=";
    /**
     * 我的订单，待付款订单
     */
    public static final String MY_ORDER_OBLIGATION_ONE = url_miao + "/api/v5/member/order/list.jhtml?pageNumber=";
    public static final String MY_ORDER_OBLIGATION_TOKEN = "&token=";
    public static final String MY_ORDER_OBLIGATION_TWO = "&status=pendingPayment&timeString=xxx";
    /**
     * 我的订单，待收货
     */
    public static final String MY_ORDER_TO_TAKE_ONE = url_miao + "/api/v5/member/order/list.jhtml?pageNumber=";
    public static final String MY_ORDER_TO_TAKE_TOKEN = "&token=";
    public static final String MY_ORDER_TO_TAKE_TWO = "&status=shipped&timeString=xxx";
    /**
     * 获取退货文字
     */
    //https://ssrj.com/b82/api/v2/user/findcustomer?appVersion=2.2.0&token=da83e19a50a084522343d96746f0d889
    public static final String MY_GOODS_RETURN_VERSION = url_ding + "/api/v2/user/findcustomer?appVersion=";
    public static final String MY_GOODS_RETURN_TOKEN = "&token=";
    /**
     * 获取取货时间
     */
    //https://ssrj.com/api/v4/member/returns/getClaimGoodsTime.jhtml?appVersion=2.2.0&token=da83e19a50a084522343d96746f0d889
    public static final String MY_GOODS_RETURN_TIME_VERSION = url_miao + "/api/v5/member/returns/getClaimGoodsTime.jhtml?appVersion=";
    public static final String MY_GOODS_RETURN_TIME_TOKEN = "&token=";
    /**
     * 获取退换货尺码
     */
    //https://ssrj.com/api/v4/member/returns/getSpecification.jhtml?productId=6814&appVersion=2.2.0&token=da83e19a50a084522343d96746f0d889
    public static final String MY_GOODS_RETURN_SIZE_ID = url_miao + "/api/v5/member/returns/getSpecification.jhtml?productId=";
    public static final String MY_GOODS_RETURN_SIZE_VERSION = "&appVersion=";
    public static final String MY_GOODS_RETURN_SIZE_TOKEN = "&token=";
    /**
     * 提交退货接口
     */
    public static final String SUBBMIT_RETURN_GOODS = url_miao + "/api/v5/member/returns/doReturnsApply.jhtml";
    /**
     * 提交换货接口
     */
    public static final String SUBBMIT_EXCHANGE_GOODS = url_miao + "/api/v5/member/returns/doApply.jhtml";
    /**
     * 已完成
     */
    public static final String MY_ORDER_DONE_ONE = url_miao + "/api/v5/member/order/list.jhtml?pageNumber=";
    public static final String MY_ORDER_DONE_TOKEN = "&token=";
    public static final String MY_ORDER_DONE_TWO = "&status=received";
    /**
     * 售后
     */
    //https://ssrj.com/api/v5/member/customerService/list.jhtml?pageNumber=1&appVersion=2.2.0&token=da83e19a50a084522343d96746f0d889
    public static final String MY_ORDER_SERVICE_ONE = url_miao + "/api/v5/member/customerService/list.jhtml?pageNumber=";
    public static final String MY_ORDER_SERVICE_VERSION = "&appVersion=";
    public static final String MY_ORDER_SERVICE_TWO = "&token=";
    // public static final String MY_ORDER_SERVICE_THREE = "&timeString=xxx";
    /**
     * 撤销申请
     */
    //https://api.ssrj.com/api/v4/member/returns/cancel/{id}.jhtml?id=退换货单ID&token=xxx    POST请求
    public static final String MY_ORDER_WITHDRAW_APPLY_ID = url_miao + "/api/v5/member/returns/cancel/";
    public static final String MY_ORDER_WITHDRAW_APPLY = ".jhtml";
    /**
     * 售后换货订单详情
     */
    //http://www.ssrj.com/api/v5/member/customerService/view.jhtml?id=1322&token=da83e19a50a084522343d96746f0d889&appVersion=1.0
    public static final String MY_RETURN_ORDER_DETAILS_ID = url_miao + "/api/v5/member/customerService/view.jhtml?id=";
    public static final String MY_RETURN_ORDER_DETAILS_TOKEN = "&token=";
    public static final String MY_RETURN_ORDER_DETAILS_VERSION = "&appVersion=";


    /**
     * 我的红包，包括未使用，已过期，未使用
     */
    public static final String MY_RED_PACKET = url_ding + "/api/v2/user/findcoupon?userId=";
    public static final String MY_RED_PACKET_VERSION = "&appVersion=";
    public static final String MY_RED_TOKEN = "&token=";

    /**
     * 个人中心 header
     */
    public static final String PERSONAL_ID = url_miao + "/api/v5/user/userIndex.jhtml?id=";
    //    public static final String PERSONAL_ID = url + "api.ssrj.com/api/v4/user/userIndex.jhtml?id=";
    public static final String PERSONAL_VERSION = "&appVersion=";
    public static final String PERSONAL_TOKEN = "&token=";
    /**
     * 个人中心，发布
     */
    //自己的发布列表
    ///content/publish/list/?page_index=1&page_size=10
    //他人的发布列表
    ///content/publish/list/user/<host_uid>/?page_index=1&page_size=10
    public static final String PERSONAL_PUBLISH_NEW = url_wen + "/api/v1/content/publish/list/user/";
    public static final String PERSONAL_PUBLISH_OWNER_NEW = url_wen + "/api/v1/content/publish/list";
    public static final String PERSONAL_PUBLISH_NEW_PAGE_INDEX = "/?page_index=";
    public static final String PERSONAL_PUBLISH_NEW_PAGE_SIZE = "&page_size=";
    public static final String PERSONAL_PUBLISH_NEW_APPVERSION = "&appVersion=";

    public static final String PERSONAL_PUBLISH = "http://ssrj.com/b82/api/v5/brand/findbranddynamic?appVersion=2.2.0&id=16828&pageIndex=1&pageSize=10&token=da83e19a50a084522343d96746f0d889&type=member&useFor=app";
    public static final String PERSONAL_PUBLISH_ID = url + "ssrj.com/b82/api/v5/brand/findbranddynamic?id=";
    public static final String PERSONAL_PUBLISH_VERSION = "&appVersion=";
    public static final String PERSONAL_PUBLISH_TOKEN = "&token=";
    public static final String PERSONAL_PUBLISH_POSITION = "&pageSize=10&type=member&useFor=app&pageIndex=";
    /**
     * 个人中心，点赞
     */
    public static final String PERSONAL_DIANZAN = "http://ssrj.com/b82/api/v5/brand/findthumb?appVersion=2.2.0&id=2377&pageIndex=1&pageSize=10&token=da83e19a50a084522343d96746f0d889&type=member&useFor=app";
    public static final String PERSONAL_DIANZAN_ID = "http://ssrj.com/b82/api/v5/brand/findthumb?id=";
    public static final String PERSONAL_DIANZAN_VERSION = "&appVersion=";
    public static final String PERSONAL_DIANZAN_TOKEN = "&token=";
    public static final String PERSONAL_DIANZAN_POSITION = "&pageSize=10&type=member&useFor=app&pageIndex=";
    /**
     * 新的个人中心，点赞
     */
    //https://ssrj.com/b180/api/v1
    //自己的点赞列表
    ///content/like/list/?page_index=1&page_size=10
    //他人的点赞列表
    ///content/like/user/<host_uid>/list/?page_index=1&page_size=3
    public static final String PERSONAL_DIANZAN_NEW = url_wen + "/api/v1/content/like/user/";
    public static final String PERSONAL_DIANZAN_NEW_OWNER_PAGE_INDEX = "?page_index=";
    public static final String PERSONAL_DIANZAN_OWNER_NEW = url_wen + "/api/v1/content/like/list/";
    public static final String PERSONAL_DIANZAN_NEW_PAGE_INDEX = "/list/?page_index=";
    public static final String PERSONAL_DIANZAN_NEW_VERSION = "&appVersion=";
    public static final String PERSONAL_DIANZAN_NEW_TOKEN = "&token=";
    public static final String PERSONAL_DIANZAN_NEW_PAGE_SIZE = "&page_size=";

    /**
     * 个人中心  余额
     */
    public static final String PERSONAL_BALANCE_ID = url_ding + "/api/v2/user/finddeposit?userId=";
    public static final String PERSONAL_BALANCE_TOKEN = "&token=";
    public static final String PERSONAL_BALANCE_POSITION = "&pageSize=20&pageIndex=";

    /**
     * 我的资讯 type = inform
     * 我的合辑 type = theme_item
     * 我的单品 type = goods --收藏
     */
    //https://ssrj.com/b82/api/v5/find-thumb-list?pageIndex=1&pageSize=10&type=inform&token=da83e19a50a084522343d96746f0d889&appVersion=V1.0
    public static final String MY_COLLECTION_ID = url_ding + "/api/v5/find-thumb-list?&appVersion=";
    public static final String MY_COLLECTION_TOKEN = "&token=";
    public static final String MY_COLLECTION_PAGEINDEX = "&pageIndex=";
    public static final String MY_COLLECTION_PAGESIZE = "&pageSize=";
    public static final String MY_COLLECTION_TYPE = "&type=";
    public static final String MY_COLLECTION_THEME_ITEM = "theme_item";
    public static final String MY_COLLECTION_INFORM = "inform";
    public static final String MY_COLLECTION_GOODS = "goods";

    //收藏的资讯，文敬
    //  public static final String MY_INFORM_VERSION="http://192.168.1.3:8770/api/v1/content/like/inform/list/?appVersion=";
    public static final String MY_INFORM_VERSION = url_wen_new_www + "/content/like/inform/list/?appVersion=";

    // public static final String MY_COLLECTION_VERSION= "http://192.168.1.3:8770/api/v1/content/like/goods/list/?appVersion=;
    public static final String MY_COLLECTION_VERSION = url_wen_new_www + "/content/like/goods/list/?appVersion=";
    // public static final String MY_COLLECTION_VERSION_BUY= "http://192.168.1.3:8770/api/v1/content/like/goods/list/bought/?appVersion=";
    public static final String MY_COLLECTION_VERSION_BUY = url_wen_new_www + "/content/bought/goods/list/?appVersion=";

    //收藏的合辑，文敬
    // public static final String MY_COLLECTION_VWESION_W= "http://192.168.1.3:8770/api/v1/content/like/theme_item/list/?appVersion=";
    public static final String MY_COLLECTION_VWESION_W = url_wen_new_www + "/content/like/theme_item/list/?appVersion=";

    //我的单品--已购买
    //https://ssrj.com/b82/api/v5/goods/findboughtgoods?pageIndex=1&pageSize=10&token=da83e19a50a084522343d96746f0d889&appVersion=2.2.0
    public static final String MY_COLLECTION_PRODUCT_BUY_ID = url_ding + "/api/v5/goods/findboughtgoods?appVersion=";

    /**
     * 我的搭配
     */
    //https://ssrj.com/api/v5/member/thumbsupCollocation.jhtml?appVersion=2.2.0&pageNumber=1&token=da83e19a50a084522343d96746f0d889
    public static final String MY_PAIRS_ID = url_miao + "/api/v5/member/thumbsupCollocation.jhtml?appVersion=";
    public static final String MY_PAIRS_PAGENUMBER = "&pageNumber=";
    //  public static final String MY_LOOKS_VERSION ="http://192.168.1.3:8770/api/v1/content/like/collocation/list/?appVersion=1&token=da83e19a50a084522343d96746f0d889&page_index=1&page_size=10";
    public static final String MY_LOOKS_VERSION = url_wen_new_www + "/content/like/collocation/list/?appVersion=";
    /**
     * 关注列表
     */

    public static final String FOLLOWING_ID = "http://101.251.196.180:8762/inner_api/v1/social/follow/list/";
    public static final String FOLLOWING_USER_ID = "&id=";
    public static final String FOLLOWING_PAGENUMBER = "&pageNumber=";

    //用户
    //https://ssrj.com/api/v5/user/listUserSubscribes.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&id=2377&pageNumber=1
    public static final String FOLLOWING_NEW = url_miao + "/api/v5/user/listUserSubscribes.jhtml?appVersion=";
    public static final String FOLLOWING_NEW_TOKEN = "&token=";
    public static final String FOLLOWING_NEW_ID = "&id=";
    public static final String FOLLOWING_NEW_PAGENUMBER = "&pageNumber=";

    //品牌
    //https://ssrj.com/api/v5/brand/listBrandSubscribes.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&id=107&pageNumber=1
    //https://ssrj.com/api/v5/brand/listBrandFans.jhtml?appVersion=1.0.0&pageNumber=1&token=3ebda71540f18f914264af19b9f931e8&id=35880
    public static final String FOLLOWING_BRAND_NEW = url_miao + "/api/v5/brand/listBrandSubscribes.jhtml?appVersion=";

    /**
     * 粉丝列表
     */
    public static final String FOLLOWER_ID = "http://101.251.196.180:8762/inner_api/v1/social/follower/person/list/";
    public static final String FOLLOWER_BRAND_ID = "http://101.251.196.180:8762/inner_api/v1/social/follower/brand/list/";
    public static final String FOLLOWER_PAGE_INDEX = "?page_index=";
    public static final String FOLLOWER_PAGE_SIZE = "&page_size=";
    public static final String FOLLOWER_CURR_UID = "&current_uid=";

    //用户
    //https://ssrj.com/api/v5/user/listUserFans.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&id=2377&pageNumber=1
    public static final String FOLLOWER_NEW = url_miao + "/api/v5/user/listUserFans.jhtml?appVersion=";
    public static final String FOLLOWER_NEW_TOKEN = "&token=";
    public static final String FOLLOWER_NEW_ID = "&id=";
    public static final String FOLLOWER_NEW_PAGENUMBER = "&pageNumber=";

    //品牌
    //https://ssrj.com/api/v5/brand/listBrandFans.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&id=107&pageNumber=1
    public static final String FOLLOWER_BRAND_NEW = url_miao + "/api/v5/brand/listBrandFans.jhtml?appVersion=";

    /**
     * 关注/取消关注操作
     * :param kind: 被关注对象类型 person:用户, brand:品牌
     * :param from_uid: 进行关注的用户id
     * :param pid: 被关注对象的id
     */
    public static final String FOLLOW_ID = "http://101.251.196.180:8762/inner_api/v1/social/follow/";
    //<brand|person>
    public static final String FOLLOW_URL = url_wen + "/api/v1/sns/subscribe/status/";

    /**
     * 品牌关注与取消关注
     */
    //https://ssrj.com/api/v5/member/subscribe/subscribeBrand.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&id=76
//    public static final String BRAND_FOLLOW = url_miao + "/api/v5/member/subscribe/subscribeBrand.jhtml?appVersion=";
    public static final String BRAND_FOLLOW = url_miao + "/api/v5/member/subscribe/subscribeBrand.jhtml";
    public static final String BRAND_FOLLOW_TOKEN = "&token=";
    public static final String BRAND_FOLLOW_ID = "&id=";

    /**
     * 用户关注与取消关注
     */
    //https://ssrj.com/api/v5/member/subscribe/subscribeUser.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&id=2352
//    public static final String PERSON_FOLLOW = url_miao + "/api/v5/member/subscribe/subscribeUser.jhtml?appVersion=";
    public static final String PERSON_FOLLOW = url_miao + "/api/v5/member/subscribe/subscribeUser.jhtml";
    public static final String PERSON_FOLLOW_TOKEN = "&token=";
    public static final String PERSON_FOLLOW_ID = "&id=";

    /**
     * 关注状态
     */
    public static final String FOLLOW_STATUS_ID = "http://101.251.196.180:8762/inner_api/v1/social/follow/status/";

    /**
     * 发布列表：
     * https://ssrj.com/b82/api/v5/brand/findbranddynamic?pageIndex=1&pageSize=10&token=da83e19a50a084522343d96746f0d889&appVersion=2.2.0&type=member&id=2377
     * type 取值为：member或brand
     */
    //https://ssrj.com/b82/api/v5/brand/findbranddynamic?pageIndex=1&pageSize=10&token=da83e19a50a084522343d96746f0d889&appVersion=2.2.0&type=member&id=2377
    public static final String PERSON_PUBLISH_ID = url_ding + "/api/v5/brand/findbranddynamic?id=";
    public static final String PERSON_PUBLISH_TOKEN = "&token=";
    public static final String PERSON_PUBLISH_PAGEINDEX = "&pageIndex=";
    public static final String PERSON_PUBLISH_PAGESIZE = "&pageSize=";
    public static final String PERSON_PUBLISH_TYPE = "&type=";
    public static final String PERSON_PUBLISH_APP_VERSION = "&appVersion=";

    /**
     * 点赞列表：https://ssrj.com/b82/api/v5/brand/findthumb?pageIndex=1&pageSize=10&token=da83e19a50a084522343d96746f0d889&appVersion=2.2.0&type=member&id=2377
     * type 取值为：member或brand
     */
    public static final String PERSON_COLLECT_ID = url_ding + "/api/v5/brand/findthumb?id=";
    public static final String PERSON_COLLECT_TOKEN = "&token=";
    public static final String PERSON_COLLECT_PAGEINDEX = "&pageIndex=";
    public static final String PERSON_COLLECT_PAGESIZE = "&pageSize=";
    public static final String PERSON_COLLECT_TYPE = "&type=";
    public static final String PERSON_COLLECT_APP_VERSION = "&appVersion=";

    /**
     * 修改昵称
     */
    //http://www.ssrj.com/api/v3/member/updateNickname.jhtml?appVersion=&token=da83e19a50a084522343d96746f0d889&nickname=xx
    public static final String MODIFY_PERSON_INFO_NICK_NAME_ID = url_miao + "/api/v5/member/updateNickname.jhtml?appVersion=";
    public static final String MODIFY_PERSON_INFO_TOKEN = "&token=";
    public static final String MODIFY_PERSON_INFO_NICK_NAME = "&nickname=";

    /**
     * 修改个人签名
     */
    ///api/v3/member/updateGender.jhtml?appVersion=&token=da83e19a50a084522343d96746f0d889&introduction=xx
    public static final String MODIFY_PERSON_INFO_SINGATURE_ID = url_miao + "/api/v5/member/updateIntroduction.jhtml?appVersion=";
    public static final String MODIFY_PERSON_INFO_SINGATURE = "&introduction=";

    /**
     * 修改邮箱
     */
    ///api/v3/member/updateEmail.jhtml?appVersion=&token=da83e19a50a084522343d96746f0d889&email=xxx
    public static final String MODIFY_PERSON_INFO_EMAIL_ID = url_miao + "/api/v5/member/updateEmail.jhtml?appVersion=";
    public static final String MODIFY_PERSON_INFO_EMAIL = "&email=";

    /**
     * 修改性别
     */
    ///api/v3/member/updateGender.jhtml?appVersion=&token=da83e19a50a084522343d96746f0d889&gender=男|女
    public static final String MODIFY_PERSON_INFO_GENDER_ID = url_miao + "/api/v5/member/updateGender.jhtml?appVersion=";
    public static final String MODIFY_PERSON_INFO_GENDER = "&gender=";

    /**
     * 绑定手机号
     */
    ///api/v3/member/updateMobile.jhtml?appVersion=&token=da83e19a50a084522343d96746f0d889&mobile=xx&smsValite=短信验证码&clientType=android&smsType=updateMobile
//    public static String MODIFY_PERSON_INFO_PHONE_ID = url_public + "/api/v5/member/updateMobile.jhtml?appVersion=";
    public static String MODIFY_PERSON_INFO_PHONE_ID = url_miao + "/api/v5/member/updateMobile.jhtml?appVersion=";
    public static String MODIFY_PERSON_INFO_PHONE_MOBILE = "&mobile=";
    public static String MODIFY_PERSON_INFO_PHONE_SMS_VALITE = "&smsValite=";
    public static String MODIFY_PERSON_INFO_PHONE_CLIENT = "&clientType=";
    public static String MODIFY_PERSON_INFO_PHONE_SMS_TYPE = "&smsType=";

    /**
     * 上传头像
     */
    ///storage/emulated/0/hudongba/download/412490801463391594540_party0.jpg
    public static String MODIFY_PERSON_INFO_HEAD_ID = url_miao + "/api/v5/member/updateAvatar.jhtml";
    public static String MODIFY_PERSON_INFO_HEAD_FILE_NAME = "&filename=";
    public static String MODIFY_PERSON_INFO_HEAD_FILE = "&file=";

    /**
     * 上传背景
     */
    ///api/v5/member/updateBackgroudImage.jhtml?appVersion=&token=da83e19a50a084522343d96746f0d889&filename=xxx
    public static String MODIFY_PERSON_INFO_BACKGROUD = url_miao + "/api/v5/member/updateBackgroudImage.jhtml";

    /**
     * 查询评论 get type:collocation、themeItem、inform
     */
    //https://ssrj.com/b82/api/v4/goods/findcommentlist?pageIndex=&pageSize=&id=&commentId=&comment=&type=&token=&appVersion=
    public static String FIND_COMMENT_LIST = url_ding + "/api/v4/goods/findcommentlist?pageIndex=";
    public static String FIND_COMMENT_LIST_PAGESIZE = "&pageSize=";
    public static String FIND_COMMENT_LIST_ID = "&id=";
    public static String FIND_COMMENT_LIST_COMMENTID = "&commentId=";
    public static String FIND_COMMENT_LIST_COMMENT = "&comment=";
    public static String FIND_COMMENT_LIST_TYPE = "&type=";
    public static String FIND_COMMENT_LIST_TOKEN = "&token=";
    public static String FIND_COMMENT_LIST_APPVERSION = "&appVersion=";


    /**
     * 插入评论 post type:collocation、themeItem、inform
     */
    //https://ssrj.com/b82/api/v4/goods/addcomment?id=&commentId=&comment=&type=&token=&appVersion=
    public static String ADD_COMMENT = url_ding + "/api/v4/goods/addcomment";
    public static String ADD_COMMENT_ID = "&id=";
    public static String ADD_COMMENT_COMMENTID = "&commentId=";
    public static String ADD_COMMENT_COMMENT = "&comment=";
    public static String ADD_COMMENT_TYPE = "&type=";
    public static String ADD_COMMENT_TOKEN = "&token=";
    public static String ADD_COMMENT_APPVERSION = "&appVersion=";

    /**
     * 删除评论
     */
    ///deleteComment?commentId=&type=&token=&appVersion=
    public static String DEL_COMMENT = url_ding + "/api/v4/goods/deleteComment?commentId=";
    public static String DEL_COMMENT_TYPE = "&type=";
    public static String DEL_COMMENT_TOKEN = "&token=";
    public static String DEL_COMMENT_APPVERSION = "&appVersion=";


    /***********************************新评论接口********************************/
    /**
     * 发布评论   搭配：collocation  合辑：theme_item  资讯：inform
     * pk:搭配id.
     * comment: 评论内容.
     * review_member_id:如果被评论的是评论,值为被评论者id,否则不传.
     */
    ///content/publish/collocation/<pk>/comments/
    public static String ADD_COMMENT_NEW = url_wen_new + "/content/publish/";
    public static String ADD_COMMENT_COMMENTS_NEW = "/comments/";
    public static String ADD_COMMENT_REVIEW_MEMBER_ID_NEW = "&review_member_id=";
    public static String ADD_COMMENT_COMMENT_NEW = "&comment=";
    public static String ADD_COMMENT_TOKEN_NEW = "&token=";
    public static String ADD_COMMENT_APPVERSION_NEW = "&appVersion=";

    /**
     * 获取评论列表  搭配：collocation  合辑：theme_item  资讯：inform
     * pk:搭配id
     * page_index:页号,从1开始.
     * page_size:每页项数.
     */
    ///content/publish/collocation/<pk>/comments/?page_index=1&page_size=10
    public static String COMMENTS_LIST_NEW = url_wen_new + "/content/publish/";
    public static String COMMENTS_LIST_NEW_PAGESIZE = "&page_size=";
    public static String COMMENTS_LIST_NEW_PAGE_INDEX = "&page_index=";
    public static String COMMENTS_LIST_NEW_COMMENTS = "/comments/";
    public static String COMMENTS_LIST_NEW_TOKEN = "?token=";
    public static String COMMENTS_LIST_NEW_APPVERSION = "&appVersion=";

    /**
     * 删除评论  搭配：collocation  合辑：theme_item  资讯：inform
     * pk:搭配评论id.
     */
    ///content/publish/collocation/comments/ <pk>/
    public static String DEL_COMMENT_NEW = url_wen_new + "/content/publish/";
    public static String DEL_COMMENT_COMMENTS = "/comments/";

    //----------------------------------新评论接口--------------------------------//


    /**
     * 积分列表
     */
    //https://ssrj.com/b82/api/v5/user/findponit?userId=2377&appVersion=2.2.0&token=da83e19a50a084522343d96746f0d889
    public static String MY_INTEGRATION_ID = url_ding + "/api/v5/user/findponit?userId=";
    public static String MY_INTEGRATION_VERSION = "&appVersion=";
    public static String MY_INTEGRATION_TOKEN = "&token=";
    /**
     * 会员等级
     */
    //https://ssrj.com/api/v5/member/index.jhtml?appVersion=2.2.0&token=da83e19a50a084522343d96746f0d889
    public static String MEMBER_DEGREE_VERSION = url_miao + "/api/v5/member/index.jhtml?appVersion=";
    public static String MEMBER_DEGREE_TOKEN = "&token=";

    /**
     * 保存问卷调查答案 GET
     */
    //https://ssrj.com/b82/api/v5/clad-aide/addstylefeatrueuser?token=&heights=&hipline=&waist=&weight=&bust=&appVersion=
    public static String BUY_ASSISTANT = url_ding + "/api/v5/clad-aide/addstylefeatrueuser?token=";
    public static String BUY_ASSISTANT_HEIGHTS = "&heights=";
    public static String BUY_ASSISTANT_HIPLINE = "&hipline=";
    public static String BUY_ASSISTANT_WAIST = "&waist=";
    public static String BUY_ASSISTANT_WEIGHT = "&weight=";
    public static String BUY_ASSISTANT_BUST = "&bust=";
    public static String BUY_ASSISTANT_APPVERSION = "&appVersion=";

    /**
     * 获取购买助手数据
     */
    //https://ssrj.com/b82/api/v3/goods/findfeatruegrouplist?quetionId=1&token=79b9b82b354d17d21c8d024c9134c473&appVersion=3.0.0
    public static String BUY_ASSISTANT_DATA = url_ding + "/api/v3/goods/findfeatruegrouplist?quetionId=";
    public static String BUY_ASSISTANT_DATA_APPVERSION = "&appVersion=";
    public static String BUY_ASSISTANT_DATA_TOKEN = "&token=";


    /**---------------------------我的日记----------------------------------**/

    /*******购物支付有关********/

    /**
     * 支付测试,微信
     */
    public static final String PAY_TEST = "http://192.168.1.181:8763/fin/pay/wx/order/unifiedorder/";
    /**
     * 支付宝支付，测试
     */
    public static final String PAY_TEST_ALIPY = "http://192.168.1.181:8763/fin/pay/ali/order/pay/?order_no=993&total_fee=0.01&trade_type=mobile&subject=a";
    public static final String PAY_TEST_ALIPY_NAME = "http://192.168.1.181:8763/fin/pay/ali/order/pay/?trade_type=mobile&subject=";
    public static final String PAY_TEST_ALIPY_NO = "&order_no=";
    public static final String PAY_TEST_ALIPY_NUM = "&total_fee=";
    /**
     * 校验商品库存
     */
    //https://ssrj.com/api/v5/product/check.jhtml?token=cd148e339eae1b31d69c006378f99e2f&appVersion=3.0&productId=2897
    public static final String CHCEK_STOCK_TOKEN = url_miao + "/api/v5/product/check.jhtml?token=";
    public static final String CHCEK_STOCK_VERSION = "&appVersion=";
    public static final String CHCEK_STOCK_PRODUCT_ID = "&productId=";
    /**
     * 添加购物车
     */
    //  public static final String GOUWU = "http://www.ssrj.com/api/v2/member/cart/add.jhtml?token=da83e19a50a084522343d96746f0d889&collocationId=5232&productId=4010&quantity=1";
    public static final String SHOPPING_CART_PRODUCT_ID = "https://ssrj.com/api/v5/member/cart/add.jhtml?productId=";
    public static final String SHOPPING_CART_TOKEN = "&token=";
    public static final String SHOPPING_CART_VERSION = "&appVersion=";
    public static final String SHOPPING_CART_QUANTITY = "&quantity=";
    public static final String SHOPPING_CART_COLLECTION_ID = "&collocationId=";
    /**
     * 添加到购物车，预售
     */
    // https://ssrj.com/api/v5/member/cart/add_product.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&collocationId=666&productId=339&quantity=1
    public static final String SHOPPING_CART_PRE_PRODUCT_VERSION = url_miao + "/api/v5/member/cart/add_product.jhtml?appVersion=";
    public static final String SHOPPING_CART_PRE_PRODUCT_OKEN = "&token=";
    public static final String SHOPPING_CART_PRE_PRODUCT_COLLECTION_ID = "&collocationId=";
    public static final String SHOPPING_CART_PRE_PRODUCT_QUANTITY = "&quantity=";
    public static final String SHOPPING_CART_PRE_PRODUCT_PRODUCT_ID = "&productId=";
    /**
     * 添加购物车，含预售 post
     */
    //https://ssrj.com/api/v5/member/cart/add_product.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&collocationId=666&productId=339&quantity=1
    public static final String ADD_TO_SHOPPING_CART = url_miao + "/api/v5/member/cart/add_product.jhtml";

    /**
     * 修改购物车商品数量  post
     */
    //https://ssrj.com/api/v5/member/cart/edit.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&id=339&quantity=1
    public static final String EDIT_SHOPPING_CART_NUM = url_miao + "/api/v5/member/cart/edit.jhtml";
    /**
     * 修改购物车商品数量  post ,新的,+-购物车项（含预售 type (1:加，0：减)）POST
     */
    //https://ssrj.com/api/v5/member/cart/update.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&id=339&type=1
    public static final String EDIT_SHOPPING_CART_NUMBER = url_miao + "/api/v5/member/cart/update.jhtml";
    /**
     * 立即购买
     */
    //  public static final String BUY_NOW = "http://www.ssrj.com/api/v2/member/cart/buy.jhtml?token=da83e19a50a084522343d96746f0d889&collocationId=5232&productId=4010&quantity=1";
    public static final String BUY_NOW_PRODUCT_ID = url_public + "/api/v5/member/cart/buy.jhtml?productId=";
    public static final String BUY_NOW_TOKEN = "&token=";
    public static final String BUY_NOW_QUANTITY = "&quantity=";
    public static final String BUY_NOW_COLLECTION_ID = "&collocationId=";
    /**
     * 立即购买  新 post
     */
    //https://ssrj.com/api/v5/member/cart/buy_product.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&collocationId=666&productId=339&quantity=1
    public static final String BUY_NOW_NEW = url_miao + "/api/v5/member/cart/buy_product.jhtml";
    /**
     * 查看购物车
     */
    public static final String SHOPPING_CART_INFO = url_miao + "/api/v5/member/cart.jhtml?appVersion=";
    public static final String SHOPPING_CART_INFOTOKEN = "&token=";
    /**
     * 单项删除购物车
     */
    public static final String SHOPPING_CART_DELETE_ITEM = url_miao + "/api/v5/member/cart/delete.jhtml?id=";
    public static final String SHOPPING_CART_DELETE_VERSION = "&appVersion=";
    public static final String SHOPPING_CART_DELETE_TOKEN = "&token=";
    /**
     * 多项删除购物车
     */
    public static final String SHOPPING_CART_DELETE_ITEMS = url_miao + "/api/v5/member/cart/deleteCartItemIds.jhtml?ids=";
    public static final String SHOPPING_CART_DELETE_VERSIONS = "&appVersion=";
    public static final String SHOPPING_CART_DELETE_TOKENS = "&token=";
    /**
     * 查询支付订单
     */
    //"http://www.ssrj.com/api/v5/member/order/checkout.jhtml?appVersion=1.0&token=da83e19a50a084522343d96746f0d889&ids=41295,41289,41294,41288"
    public static final String PAYMENT_ORDER = url_public + "/api/v5/member/order/checkout.jhtml?ids=";
    public static final String PAYMENT_ORDER_VERSION = "&appVersion=";
    public static final String PAYMENT_ORDER_TOKEN = "&token=";
    /**
     * 购物车结算，查询支付订单，含预售
     */
    //https://ssrj.com/api/v5/member/order/checkout_orders.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&ids=22,33
    public static final String PAYMENT_ORDER_PRE = url_miao + "/api/v5/member/order/checkout_orders.jhtml?ids=";
    public static final String PAYMENT_ORDER_PRE_VERSION = "&appVersion=";
    public static final String PAYMENT_ORDER_PRE_TOKEN = "&token=";
    /**
     * 查询地址列表
     */
    //http://www.ssrj.com/api/v2/member/receiver/list.jhtml?token=da83e19a50a084522343d96746f0d889&pageNumber=1
    public static final String ADDRESS_LIST = url_miao + "/api/v5/member/receiver/list.jhtml?pageNumber=";
    public static final String ADDRESS_LIST_TOKEN = "&token=";
    /**
     * 修改用户收货地址
     */
    //http://www.ssrj.com/api/v2/member/receiver/update.jhtml?token=da83e19a50a084522343d96746f0d889&id=3977&areaId=20&consignee=路亚枫&isDefault=0&address=和平西路&zipCode=100000&phone=18340081234
    public static final String ADDRESS_EDIT_ID = url_miao + "/api/v5/member/receiver/update.jhtml?id=";
    public static final String ADDRESS_EDIT_TOKEN = "&token=";
    public static final String ADDRESS_EDIT_AREA = "&areaId=";
    public static final String ADDRESS_EDIT_NAME = "&consignee=";
    public static final String ADDRESS_EDIT_ISDEFAULT = "&isDefault=";
    public static final String ADDRESS_EDIT_ADDRESS = "&address=";
    public static final String ADDRESS_EDIT_ZIPCODE = "&zipCode=";
    public static final String ADDRESS_EDIT_PHONE = "&phone=";
    /**
     * 新增收货地址
     */
    //http://www.ssrj.com/api/v2/member/receiver/add.jhtml?token=xxx&areaId=地区&consignee=收货人&isDefault=是否默认(true/false)&address=地址&zipCode=邮编&phone=手机号

    public static final String ADDRESS_ADD_AREA = url_miao + "/api/v5/member/receiver/add.jhtml?areaId=";
    public static final String ADDRESS_ADD_TOKEN = "&token=";
    public static final String ADDRESS_ADD_NAME = "&consignee=";
    public static final String ADDRESS_ADD_ISDEFAULT = "&isDefault=";
    public static final String ADDRESS_ADD_ADDRESS = "&address=";
    public static final String ADDRESS_ADD_ZIPCODE = "&zipCode=";
    public static final String ADDRESS_ADD_PHONE = "&phone=";

    /**
     * 设为默认收货地址
     */
    public static final String ADDRESS_DEFAULT = url_miao + "/api/v5/member/receiver/setDefault.jhtml?id=";
    public static final String ADDRESS_DEFAULT_TOKEN = "&token=";
    /**
     * 删除地址
     */
    public static final String DELETE_ADDRESS = url_miao + "/api/v5/member/receiver/delete.jhtml?id=";
    public static final String DELETE_ADDRESS_TOKEN = "&token=";
    /**
     * 提交订单界面，查询可使用的现金券
     */
    public static final String CASH_COUPON_USE = url_miao + "/api/v5/member/couponCode/listValid.jhtml?cartItemIds=";
    public static final String CASH_COUPON_USE_VERSION = "&appVersion=";
    public static final String CASH_COUPON_USE_TOKEN = "&token=";
    /**
     * 提交订单界面，查询不可使用的现金券
     */
    //41654,41655,
    public static final String CASH_COUPON_NO_USE = url_miao + "/api/v5/member/couponCode/listUnValid.jhtml?cartItemIds=";
    public static final String CASH_COUPON_NO_USE_VERSION = "&appVersion=";
    public static final String CASH_COUPON_NO_USE_TOKEN = "&token=";
    /**
     * 查询购物车数量
     */
    public static final String QUERY_SHOP_BAG_NUM = url_miao + "/api/v5/member/cart/getCartQuantity.jhtml?appVersion=";
    public static final String QUERY_SHOP_BAG_TOKEN = "&token=";
    /**
     * 修改收货地址或者使用现金券后，返回结算界面
     */
    //https://ssrj.com/api/v5/member/order/settlement.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&ids=47952&receiverId=3604&code=401f1qC9ist
    public static final String BALANCE_AFTER_CHANGE_IDS = url_miao + "/api/v5/member/order/settlement.jhtml?ids=";
    public static final String BALANCE_AFTER_CHANGE_RECEIVED_ID = "&receiverId=";
    public static final String BALANCE_AFTER_CHANGE_CODE = "&code=";


    /**
     * 生成订单,发票信息和备注信息暂时未用到
     */
    //http://www.ssrj.com/api/v2/member/order/create.jhtml?token=xxx&cartItemIds=购物车项&cartToken=购物车token&receiverId=收货地址ID
    // &paymentMethodId=支付方式ID&shippingMethodId=配送方式ID&code=优惠券code&invoiceTitle=发票抬头（暂时未使用）&balance=使用的预存款&memo=备注信息
    //http://www.ssrj.com/api/v2/member/order/create.jhtml?token=da83e19a50a084522343d96746f0d889&cartItemIds=41654,41655,&cartToken=48a644f5fefd9ee7aa97660ec3d6709e
    // &receiverId=4065&paymentMethodId=2&shippingMethodId=6&code=survey100dm81aAGW&balance=100
    public static final String GENERATE_ORDER_CARTITEMIDS = url_miao + "/api/v5/member/order/create.jhtml?cartItemIds=";
    public static final String GENERATE_ORDER_VERSION = "&appVersion=";
    public static final String GENERATE_ORDER_TOKEN = "&token=";
    public static final String GENERATE_ORDER_CARDTOKEN = "&cartToken=";
    public static final String GENERATE_ORDER_RECEIVE_ID = "&receiverId=";
    public static final String GENERATE_ORDER_PAYMENT_ID = "&paymentMethodId=";
    public static final String GENERATE_ORDER_SHIP_ID = "&shippingMethodId=";
    public static final String GENERATE_ORDER_CODE = "&code=";
    public static final String GENERATE_ORDER_BALANCE = "&balance=";
    public static final String GENERATE_ORDER_EXANGE = "&exchangePointAmount=";
    /**
     * 创建订单，新接口，post
     */
    //https://ssrj.com/api/v5/member/order/create_orders.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f
    // &cartItemIds=22,33&cartToken=cd148e339eae1b31d69c006378f99e2f&receiverId=1&paymentMethodId=1
    // &shippingMethodId=1&code=&invoiceTitle=&balance=&exchangePointAmount=&memo=&clientType=android|ios
    public static final String GENERATE_ORDER_PRE = url_miao + "/api/v5/member/order/create_orders.jhtml";
    /**
     * 支付地址，支付宝
     */
    //http://www.ssrj.com/api/v2/payment.jhtml?token=xxx&type=支付类型(recharge余额支付|payment在线支付）&paymentPluginId=alipayDirectPaymentPlugin&sn=订单编号&amount=支付金额
    public static final String PAY_ORDER_TYPE = url_miao + "/api/v5/payment.jhtml?type=";
    public static final String PAY_ORDER_TYPE_TOKEN = "&token=";
    public static final String PAY_ORDER_PLUGINID = "&paymentPluginId=";
    public static final String PAY_ORDER_SN = "&sn=";
    public static final String PAY_ORDER_AMOUNT = "&amount=";
    public static final String PAY_ORDER_ANDROID = "&isAndroid=";
    /**
     * 支付地址，微信支付
     */
    //https://ssrj.com/api/v5/payment/weixinPayment.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&sn=78907890
    //https://www.ssrj.com/api/v2/payment/weixinPayment.jhtml?token=da83e19a50a084522343d96746f0d889&sn=订单号
    public static final String PAY_ORDER_WECHAT_SN = url_miao + "/api/v5/payment/weixinPayment.jhtml?sn=";
    //    public static final String PAY_ORDER_WECHAT_SN_V5 = url_miao + "/api/v5/payment/weixinPayment.jhtml?sn=";
    public static final String PAY_ORDER_WECHAT_TOKEN = "&token=";

    /**
     * 校验支付结果
     */
    //https://ssrj.com/api/v5/payment/payment_result.jhtml?token=cd148e339eae1b31d69c006378f99e2f&paymentSn=11223344&trade_status_code=9000
    public static final String PAY_ORDER_RESULT_SN = url_miao + "/api/v5/payment/payment_result.jhtml?paymentSn=";
    public static final String PAY_ORDER_RESULT_CODE = "&trade_status_code=";
    /**
     * 订单相关
     */
    /**
     * 订单详情
     */
    //http://www.ssrj.com/api/v2/member/order/view.jhtml?appVersion=1.0&token=da83e19a50a084522343d96746f0d889&id=9708
    public static final String ORDER_DETAILS = url_miao + "/api/v5/member/order/view.jhtml?id=";
    public static final String ORDER_DETAILS_VERSION = "&appVersion=";
    public static final String ORDER_DETAILS_TOKEN = "&token=";

    /**
     * 取消订单
     */
    //https://ssrj.com/api/v4/member/order/cancel.jhtml?token=xx&orderSn=xx&reason=xx post请求
    public static final String ORDER_CANCEL = url_miao + "/api/v5/member/order/cancel.jhtml";
    public static final String ORDER_CANCEL_DONE = url_miao + "/api/v5/member/order/apply/refund.jhtml";
    /**
     * 获取查看物流数据
     */
    public static final String GET_SHIPPING_DATA = url_miao + "/api/v5/member/order/logistics.jhtml?shippingSn=";
    /**
     * 撤回申请，还未发货，取消订单 post
     */
    //https://ssrj.com/api/v5/member/order/cancel/apply/refund.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&orderSn=2017010672032
    public static final String WITHDRAW_APPLY = url_miao + "/api/v5/member/order/cancel/apply/refund.jhtml";
    /**
     * 确认收货 get
     */
    // https://ssrj.com/api/v5/member/order/receive.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&orderSn=2017012275548
    public static final String CONFIRM_RECEIPT_VERSOION = url_miao + "/api/v5/member/order/receive.jhtml?appVersion=";
    public static final String CONFIRM_RECEIPT_TOKEN = "&token=";
    public static final String CONFIRM_RECEIPT_ORDERSN = "&orderSn=";

    /**
     * 兑换优惠券
     */
    public static final String EXCHANGE_CODE_VERSION = url_miao + "/api/v5/member/couponCode/check_coupon.jhtml?appVersion=";
    public static final String EXCHANGE_CODE_TOKEN = "&token=";
    public static final String EXCHANGE_CODE_CODE = "&code=";
    /**
     * 分享成功后回调，单品
     */
    public static final String SHARE_SUCCESS_SINGLE = url_wen + "/api/v1/point/variation?type=33&id=";
    public static final String SHARE_SUCCESS_SINGLE_TOKEN = "&token=";
    /**
     * 分享成功后回调，网页
     */
    public static final String SHARE_SUCCESS_WEB = url_wen + "/api/v1/point/variation?type=35&id=";
    public static final String SHARE_SUCCESS_WEB_TOKEN = "&token=";
    /**
     * 分享成功后回调，活动
     */
    //http://report.ssrj.com/api/v1/point/variation?type=35&parameter=83&token=7b36988ae5519ddd8b5be1c99e3a0213
    public static final String SHARE_SUCCESS_PROMOTION = url_wen + "/api/v1/point/variation?type=35&parameter=";
    public static final String SHARE_SUCCESS_PROMOTION_TOKEN = "&token=";

    /**
     * 分享成功后回调，分享合辑
     */
    public static final String SHARE_SUCCESS_COLLECTION = url_wen + "/api/v1/point/variation?type=34&id=";
    public static final String SHARE_SUCCESS_COLLECTION_TOKEN = "&token=";
    /**
     * 分享成功后回调，分享搭配
     */
    public static final String SHARE_SUCCESS_LOOKS = url_wen + "/api/v1/point/variation?type=32&id=";
    public static final String SHARE_SUCCESS_LOOKS_TOKEN = "&token=";
    /**
     * 分享成功后回调，分享资讯
     */
    public static final String SHARE_SUCCESS_INFORM = url_wen + "/api/v1/point/variation?type=36&id=";
    public static final String SHARE_SUCCESS_INFORM_TOKEN = "&token=";

    public static final String NEW_FRIENDS_USERNAME = "item_new_friends";
    public static final String GROUP_USERNAME = "item_groups";
    public static final String CHAT_ROOM = "item_chatroom";
    public static final String ACCOUNT_REMOVED = "account_removed";
    public static final String ACCOUNT_CONFLICT = "conflict";
    public static final String ACCOUNT_BE_BLOCKED = "be_blocked";
    public static final String CHAT_ROBOT = "item_robots";
    public static final String MESSAGE_ATTR_ROBOT_MSGTYPE = "msgtype";
    public static final String ACTION_GROUP_CHANAGED = "action_group_changed";
    public static final String ACTION_CONTACT_CHANAGED = "action_contact_changed";


    /**
     * 获取活动相关信息
     */
    //https://ssrj.com/api/v5/event/view.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&id=1350
    public static final String ACTIVITY_INFO = url_miao + "/api/v5/event/view.jhtml?appVersion=";
    public static final String ACTIVITY_INFO_TOKEN = "&token=";
    public static final String ACTIVITY_INFO_ID = "&id=";

    /**
     * 校对用户token GET
     */
    //https://ssrj.com/api/v5/token/check.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f
    public static final String CHECK_TOKEN = url_miao + "/api/v5/token/check.jhtml?appVersion=";
    public static final String CHECK_TOKEN_TOKEN = "&token=";


    // 设置消息中 msgId 扩展的 key
    public static final String EM_ATTR_MSG_ID = "msg_id";
    // 设置自己扩展的消息类型的 key
    public static final String EM_ATTR_TYPE = "msg_type";
    public static final String EM_ATTR_TYPE_REVOKE = "revoke";


    //lvliheng
    //首页刷新赞状态的广播
    public static final String ACTION_REFRESH_PRAISE_STATUS = "action.refresh.praise.status";
    //资讯列表刷新赞状态的广播
    public static final String ACTION_INFORM_LIST_REFRESH_PRAISE_STATUS = ACTION_REFRESH_PRAISE_STATUS;
    //"action.inform.list.refresh.praise.status";
    //合辑列表刷新赞状态的广播
    public static final String ACTION_COLLECTIONS_LIST_REFRESH_PRAISE_STATUS = ACTION_REFRESH_PRAISE_STATUS;
    //"action.collections.list.refresh.praise.status";
    //搭配列表刷新赞状态的广播
    public static final String ACTION_LOOKS_LIST_REFRESH_PRAISE_STATUS = ACTION_REFRESH_PRAISE_STATUS;
    //"action.looks.list.refresh.praise.status";

    //筛选 刷新场合搭配列表
    public static final String ACTION_REFRESH_SINGLE_LIST = "action.refresh.single.list";


    /*************************************************
     * 微店
     *************************************************/

    public static final String E_SHOP = "http://192.168.1.173:8888/api/v1";

    /**
     * 微店用户的推荐商品接口 GET
     */
    //http://192.168.1.252:8000/api/v1/mshop/goods/list?member=15375&pagenum=1&pagesize=1
    public static final String E_SHOP_GOODS_LIST = E_SHOP + "/mshop/goods/list?member=";
    public static final String E_SHOP_GOODS_LIST_PAGE_NUM = "&pagenum=";
    public static final String E_SHOP_GOODS_LIST_PAGE_SIZE = "&pagesize=";

    /**
     * 删除推荐商品接口 POST
     */
    //http://192.168.1.252:8000/api/v1/mshop/goods/delete
    public static final String E_SHOP_DELETE_GOODS = E_SHOP + "/mshop/goods/delete";
    public static final String E_SHOP_DELETE_GOODS_TOKEN = "token";
    public static final String E_SHOP_DELETE_GOODS_ID = "id";

    /**
     * 商品筛选接口 GET
     */
    //http://192.168.1.252:8000/api/v1/eshop/filter?token=58c4920a1e605eeba881160c0865c0b7
    public static final String E_SHOP_FILTER = E_SHOP + "/eshop/filter?token=";

    /**
     * 添加推荐商品接口 POST
     */
    //http://192.168.1.252:8000/api/v1/mshop/goods/add
    public static final String E_SHOP_ADD_GOODS = E_SHOP + "/mshop/goods/add";
    public static final String E_SHOP_ADD_GOODS_TOKEN = "token";
    public static final String E_SHOP_ADD_GOODS_ID = "id";

    /**
     * 我的客户接口
     */
    //http://report.ssrj.com:11011/api/v1/yidian/record?token=600dca3e4266f12fc807c054d1f3d225&pagenum=1&pagesize=10
    public static final String E_SHOP_MY_CUSTOMERS = "http://report.ssrj.com:11011/api/v1/yidian/record?token=";
    public static final String E_SHOP_MY_CUSTOMERS_PAGE_NUM = "&pagenum=";
    public static final String E_SHOP_MY_CUSTOMERS_PAGE_SIZE = "&pagesize=";

    /**
     * 我的客户 查看更多订单
     */
    //http://report.ssrj.com:11011/api/v1/yidian/customer?member=20489&pagenum=1&pagesize=10
    public static final String E_SHOP_MY_CUSTOMERS_MORE = "http://report.ssrj.com:11011/api/v1/yidian/customer?member=";
    public static final String E_SHOP_MY_CUSTOMERS_MORE_PAGE_NUM = "&pagenum=";
    public static final String E_SHOP_MY_CUSTOMERS_MORE_PAGE_SIZE = "&pagesize=";


    public static final String E_SHOP_URL2 = url_miao + "/b180";
    /**
     * 微店分享链接
     */
    ///api/v1/member/eshop/share/link/
    public static final String E_SHOP_SHARE_INFO = E_SHOP_URL2 + "/api/v1/member/eshop/share/link/?appVersion=";
    public static final String E_SHOP_SHARE_INFO_TOKEN = "&token=";

    /**
     * 发布页用户信息
     */
    ///api/v1/content/user_info/
    public static final String E_SHOP_PUBLISH_USER_INFO = E_SHOP_URL2 + "/api/v1/content/user_info/?id=";

    /**
     * 获取自己的发布列表
     */
    ///api/v2/content/publish/list/?page_index=1&page_size=10
    public static final String E_SHOP_PUBLISH_OWNER = E_SHOP_URL2 + "/api/v2/content/publish/list/?page_index=";

    /**
     * 访客访问他人发布主页的发布列表
     */
    ///api/v2/content/publish/list/user/<host_uid>/?page_index=1&page_size=10
    public static final String E_SHOP_PUBLISH_OTHER = E_SHOP_URL2 + "/api/v2/content/publish/list/user/";
    public static final String E_SHOP_PUBLISH_PAGE_INDEX = "/?page_index=";

    /**
     * 获取用户推荐单品信息 GET
     */
    //https://ssrj.com/api/v5/user/listUserProducts.jhtml?appVersion=3.0&token=cd148e339eae1b31d69c006378f99e2f&id=339&pageNumber=1
    public static final String E_SHOP_RECOMMEND = url_miao + "/api/v5/user/listUserProducts.jhtml?appVersion=";
    public static final String E_SHOP_RECOMMEND_PAGENUMBER = "&pageNumber=";
    public static final String E_SHOP_RECOMMEND_TOKEN = "&token=";
    public static final String E_SHOP_RECOMMEND_ID = "&id=";

    /********************************************** 微店 ************************************************/


    /**********************************************
     * 在线创作
     **********************************************/

    public static final String CREATE_URL = url_miao + "/b180";

    /**
     * 自定义背景
     */
    //https://ssrj.com/b180/api/v1/collocation/background?pagenum=1&pagesize=10
    public static final String CUSTOM_BACKGROUND_PAGE_NUM = url_wen_new + "/collocation/background?pagenum=";
    public static final String CUSTOM_BACKGROUND_PAGES_SIZE = "&pagesize=";
    public static final String CUSTOM_BACKGROUND_SCENE = "&scene=";
    public static final String CUSTOM_BACKGROUND_COLOR = "&color=";

    /**
     * 首页数据（上衣，裤子，鞋子，包含素材类型）
     */
    ///api/v1/collocation/home/
    public static final String HOME_CLASSES = url_wen_new + "/collocation/home/";

    /**
     * 详细各类图片列表
     */
    ///api/v1/collocation/details?pagenum=1&pagesize=20&category=303
    public static final String HOME_CHILD_CLASSES = url_wen_new + "/collocation/details?pagenum=";
    public static final String HOME_CHILD_CLASSES_PAGSIZE = "&pagesize=";
    public static final String HOME_CHILD_CLASSES_CATEGORY = "&category=";
    public static final String HOME_CHILD_CLASSES_APPVERSION = "&appVersion=";
    public static final String HOME_CHILD_CLASSES_TOKEN = "&token=";
    /**
     * 我的点赞单品
     */
    ///collocation/like?pagenum=0&pagsize=10 &apptoken=登录
    public static final String HOME_MY_PRODUCTS = url_wen_new + "collocation/like?pagenum=";
    public static final String HOME_MY_PRODUCTS_PAGSIZE = "&pagsize=";
    public static final String HOME_MY_PRODUCTS_APPVERSION = "&appVersion=";
    public static final String HOME_MY_PRODUCTS_TOKEN = "&token=";

    /**
     * 添加单品-品牌列表
     */
    //api/v1/goodsinfor/brands?token=227a1368bd09faa8f94d9181710ba533&appVersion=22&pagenum=1&pagesize=10
    public static final String ADD_SINGLE_BRANDS = url_wen_new + "/goodsinfor/brands?token=";
    public static final String ADD_SINGLE_BRANDS_PAGES_SIZE = "&pagesize=";
    public static final String ADD_SINGLE_BRANDS_PAGE_NUM = "&pagenum=";
    public static final String ADD_SINGLE_BRANDS_APP_VERSION = "&appVersion=";

    /**
     * 获取商品名称
     */
    //https://ssrj.com/b180/api/v1/goodsinfor/goods?appVersion=3.1.2&token=3ebda71540f18f914264af19b9f931e8
    public static final String SEARCH_SINGLE = url_wen_new + "/goodsinfor/goods?appVersion=";
    public static final String SEARCH_SINGLE_TOKEN = "&token=";

    /**
     * 搜索单品
     */
    ///api/v1/goodsinfor/goods_search?name=裸色太阳眼镜&token=227a1368bd09faa8f94d9181710ba533&appVersion=22&pagenum=1&pagesize=10
    public static final String SEARCH_BY_NAME = url_wen_new + "/goodsinfor/goods_search?appVersion=";
    public static final String SEARCH_BY_NAME_KEY = "&name=";
    public static final String SEARCH_BY_NAME_TOKEN = "&token=";

    /**
     * 我收藏的单品
     */
    //https://ssrj.com/b180/api/v1/goodsinfor/my_goods?appVersion=3.1.2&pagenum=1&pagesize=15&token=3ebda71540f18f914264af19b9f931e8
    //https://ssrj.com/b180/api/v1/goodsinfor/my_goods?appVersion=3.1.2&pagenum=1&pagesize=15&token=3ebda71540f18f914264af19b9f931e8
    public static final String MY_SINGLE_PRODUCTS = url_wen_new + "/goodsinfor/my_goods?appVersion=";
    public static final String MY_SINGLE_PRODUCTS_TOKEN = "&token=";
    public static final String MY_SINGLE_PRODUCTS_PAGENUM = "&pagenum=";
    public static final String MY_SINGLE_PRODUCTS_PAGESIZE = "&pagesize=";

    /**
     * 切图列表
     */
    ///api/v1/collocation/cutout?goods=154&pagenum=1&pagesize=10
    public static final String VIEW_CUT_DATA = url_wen_new + "/collocation/cutout?goods=";
    public static final String VIEW_CUT_DATA_PAGENUM = "&pagenum=";
    public static final String VIEW_CUT_DATA_PAGESIZE = "&pagesize=";
    public static final String VIEW_CUT_DATA_TOKEN = "&token=";
    public static final String VIEW_CUT_DATA_APP_VERSION = "&appVersion=";

    /**
     * 添加单品-品牌列表
     */
    //api/v1/goodsinfor/brand_goods?brand_id=77&token=227a1368bd09faa8f94d9181710ba533&appVersion=22&pagenum=1&pagesize=10
    public static final String ADD_SINGLE_GOODS = url_wen_new + "/goodsinfor/brand_goods?brand_id=";
    public static final String ADD_SINGLE_GOODS_TOKEN = "&token=";
    public static final String ADD_SINGLE_GOODS_PAGES_SIZE = "&pagesize=";
    public static final String ADD_SINGLE_GOODS_PAGE_NUM = "&pagenum=";
    public static final String ADD_SINGLE_GOODS_APP_VERSION = "&appVersion=";

    /**
     * get : https://ssrj.com/b180/api/v1/collocationupload/mytheme?appVersion=3.0.2&pagenum=1&pagesize=20&token=873344524fb4a6be8786a3b937157283
     * post :https://ssrj.com/b180/api/v1/collocationupload/publishupload
     */
    /**
     * 上传图片-发布搭配-已有合辑列表
     */
    //https://ssrj.com/b180/api/v1/collocationupload/mytheme?appVersion=3.0.2&pagenum=1&pagesize=20&token=873344524fb4a6be8786a3b937157283
    public static final String MY_THEME = url_wen_new + "/collocationupload/mytheme?appVersion=";
    public static final String MY_THEME_TOKEN = "&token=";
    public static final String MY_THEME_PAGES_SIZE = "&pagesize=";
    public static final String MY_THEME_PAGE_NUM = "&pagenum=";

    /**
     * 上传图片-发布搭配
     */
    //https://ssrj.com/b180/api/v1/collocationupload/publishupload
    public static final String PUBLISH_LOOKS = url_wen_new + "/collocationupload/publishupload";
    public static final String PUBLISH_LOOKS_TOKEN = "&token=";
    public static final String PUBLISH_LOOKS_PAGES_SIZE = "&pagesize=";
    public static final String PUBLISH_LOOKS_PAGE_NUM = "&pagenum=";

    /**
     * 在线创作
     */
    public static final String PUBLISH_LOOKS_CREATE_ONLINE = url_wen_new + "/collocation/publish";

    /**
     * 搜索合辑
     */
    ///api/v1/goodsinfor/theme?token=227a1368bd09faa8f94d9181710ba533&appVersion=22&pagenum=1&pagesize=10
    public static final String SEARCH_COLLECTIONS = url_wen_new + "/goodsinfor/theme?token=";
    public static final String SEARCH_COLLECTIONS_APP_VERSION = "&appVersion=";
    public static final String SEARCH_COLLECTIONS_PAGES_SIZE = "&pagesize=";
    public static final String SEARCH_COLLECTIONS_PAGE_NUM = "&pagenum=";

    /**
     * 创建新合辑 POST
     */
    ///api/v1/collocationupload/createtheme/
    public static final String CREATE_COLLECTIONS = CREATE_URL + "/api/v1/collocationupload/createtheme/";
    public static final String CREATE_COLLECTIONS_TITLE = "title";
    public static final String CREATE_COLLECTIONS_BRIEF = "brief";
    public static final String CREATE_COLLECTIONS_PUBLISH = "publish";
    public static final String CREATE_COLLECTIONS_TOKEN = "token";
    public static final String CREATE_COLLECTIONS_APPVERSION = "appVersion";

    /**
     * 编辑合辑 POST
     */
    ///content/publish/theme_item/detail/<pk>/
    public static final String EDIT_COLLECTION = CREATE_URL + "/api/v1/content/publish/theme_item/detail/";
    public static final String EDIT_COLLECTION_NAME = "name";
    public static final String EDIT_COLLECTION_MEMO = "memo";
    public static final String EDIT_COLLECTION_TOKEN = "token";
    public static final String EDIT_COLLECTION_VERSION = "appVersion";
    public static final String EDIT_COLLECTION_IS_OPEN = "is_publish";
    public static final String EDIT_COLLECTION_COLLOCATION_ID = "remove_collocation_id";

    /**
     * 打开草稿箱
     */
    //https://ssrj.com/b180/api/v1/collocation/draft?appVersion=3.1.2&pagenum=1&pagesize=15&token=3ebda71540f18f914264af19b9f931e8
    public static final String DRAFT_LIST = url_wen_new + "/collocation/draft?appVersion=";
    public static final String DRAFT_LIST_TOKEN = "&token=";
    public static final String DRAFT_LIST_PAGES_SIZE = "&pagesize=";
    public static final String DRAFT_LIST_PAGE_NUM = "&pagenum=";

    /**
     * 删除草稿
     */
    //https://ssrj.com/b180/api/v1/collocation/deldraft?id=20795&appVersion=3.1.2&token=3ebda71540f18f914264af19b9f931e8
    public static final String DRAFT_DELETE = url_wen_new + "/collocation/deldraft?id=";
    public static final String DRAFT_DELETE_TOKEN = "&token=";
    public static final String DRAFT_DELETE_APPVERSION = "&appVersion=";

    /**
     * 上传图片 添加本地图片时需要先上传获取网络地址
     */
    //https://ssrj.com/b180/api/v1/collocationupload/uploadimage
    public static final String UPLOAD_ADD_PIC = url_wen_new + "/collocationupload/uploadimage";
    public static final String UPLOAD_ADD_PIC_TOKEN = "token";
    public static final String UPLOAD_ADD_PIC_APPVERSION = "appVersion";
    public static final String UPLOAD_ADD_PIC_IMAGE = "image";
    public static final String UPLOAD_ADD_PIC_FORMAT = "format";

    /******************************************** 在线创作 **********************************************/

    /**
     * 提交报错信息
     */
    //https://report.ssrj.com/api/v1/statistics/upload
    public static final String UPLOAD_INFO = "http://report.ssrj.com" + "/api/v1/statistics/upload";
    public static final String UPLOAD_INFO_UPLOAD_TYPE = "upload_type";
    public static final String UPLOAD_INFO_UPLOAD_INFOR = "upload_infor";
    public static final String UPLOAD_INFO_JSONDATA = "json";

    /**
     * 新人提示
     */
    public static final String PREFERENCE_TIP = "preference_tip";//个性设置
    public static final String MY_SIZE_TIP = "my_size_tip";//我的尺码
    public static final String JOIN_COLLECTION_TIP = "join_collection_tip";//加入合辑
    public static final String VIDEO_TIP = "video_tip";//播放视频
    public static final String LOOKS_LIST_MASK = "looks_list_mast";//搭配列表
    public static final String LOOKS_DETAIL_MASK = "looks_detail_mast";//搭配详情
    public static final String COLLECTION_DETAIL_MASK = "collection_detail_mast";//搭配详情

    /**
     * 点赞开关
     */
    public static final String SWITCH_URL = url_miao + "/api/v5/user/checkContactGateway.jhtml?appVersion=";
    public static final String SWITCH_TOKEN = "&token=";

}