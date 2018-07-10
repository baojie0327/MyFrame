package com.example.ahuang.myframe.bean; /**
 * CollectionDetailBean  2016-11-28
 * Copyright (c) 2016 HYB Co.Ltd. All right reserved.
 */

import java.util.List;

/**
 * class description here
 * @author Borje
 * @version 1.0.0
 * since 2016 11 28
 */
public class CollectionDetailBean {


    private int state;
    private String msg;
    private DataBean data;
    private String token;
    private String appVersion;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public static class DataBean {

        private int id;
        private String memo;
        private String name;
        private String picture;
        private int member;
        private int thumbsupCount;
        private String avatar;
        private String userName;
        private int countCollocation;
        private CommentBean comment;
        private int countComment;
        private boolean thumbsup;
        private List<CollocationListBean> collocationList;
        private List<MemberListBean> memberList;
        private ShareInfoBean shareInfo;

        public ShareInfoBean getShareInfo() {
            return shareInfo;
        }

        public void setShareInfo(ShareInfoBean shareInfo) {
            this.shareInfo = shareInfo;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMemo() {
            return memo;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public int getMember() {
            return member;
        }

        public void setMember(int member) {
            this.member = member;
        }

        public int getThumbsupCount() {
            return thumbsupCount;
        }

        public void setThumbsupCount(int thumbsupCount) {
            this.thumbsupCount = thumbsupCount;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getCountCollocation() {
            return countCollocation;
        }

        public void setCountCollocation(int countCollocation) {
            this.countCollocation = countCollocation;
        }

        public CommentBean getComment() {
            return comment;
        }

        public void setComment(CommentBean comment) {
            this.comment = comment;
        }

        public int getCountComment() {
            return countComment;
        }

        public void setCountComment(int countComment) {
            this.countComment = countComment;
        }

        public boolean isThumbsup() {
            return thumbsup;
        }

        public void setThumbsup(boolean thumbsup) {
            this.thumbsup = thumbsup;
        }

        public List<CollocationListBean> getCollocationList() {
            return collocationList;
        }

        public void setCollocationList(List<CollocationListBean> collocationList) {
            this.collocationList = collocationList;
        }

        public List<MemberListBean> getMemberList() {
            return memberList;
        }

        public void setMemberList(List<MemberListBean> memberList) {
            this.memberList = memberList;
        }

        public static class CommentBean {

            private String id;
            private int countComment;
            private List<CommentListBean> commentList;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getCountComment() {
                return countComment;
            }

            public void setCountComment(int countComment) {
                this.countComment = countComment;
            }

            public List<CommentListBean> getCommentList() {
                return commentList;
            }

            public void setCommentList(List<CommentListBean> commentList) {
                this.commentList = commentList;
            }

            public static class CommentListBean {
                /**
                 * member : {"id":2377,"mobile":"","name":"test6","avatar":"http://www.ssrj.com/upload/image/wxAvatar/b670b0f7-3929-4cf9-b243-3aea68275a54.jpg","userid":"MFD201512265558","memberName":"MFD201512265558","memberHead":"http://www.ssrj.com/upload/image/default_avatar_thumbnail.jpg","avatars":{"mediumPath":"http://www.ssrj.com/upload/image/default_avatar_medium.jpg","thumbnailPath":"http://www.ssrj.com/upload/image/default_avatar_thumbnail.jpg","largePath":"http://www.ssrj.com/upload/image/default_avatar_large.jpg"}}
                 * isActiveUser : false
                 * comment : nice
                 * createDate : 11月28日  13:57:11
                 * commentId : 432
                 */

                private MemberBean member;
                private boolean isActiveUser;
                private String comment;
                private String createDate;
                private int commentId;

                private ReplyMemberBean replyMember;

                public ReplyMemberBean getReplyMember() {
                    return replyMember;
                }

                public void setReplyMember(ReplyMemberBean replyMember) {
                    this.replyMember = replyMember;
                }

                public MemberBean getMember() {
                    return member;
                }

                public void setMember(MemberBean member) {
                    this.member = member;
                }

                public boolean isIsActiveUser() {
                    return isActiveUser;
                }

                public void setIsActiveUser(boolean isActiveUser) {
                    this.isActiveUser = isActiveUser;
                }

                public String getComment() {
                    return comment;
                }

                public void setComment(String comment) {
                    this.comment = comment;
                }

                public String getCreateDate() {
                    return createDate;
                }

                public void setCreateDate(String createDate) {
                    this.createDate = createDate;
                }

                public int getCommentId() {
                    return commentId;
                }

                public void setCommentId(int commentId) {
                    this.commentId = commentId;
                }

                public static class ReplyMemberBean {
                    /**
                     * id : 2377
                     * mobile :
                     * name : 李凯
                     * avatar : http://www.ssrj.com/upload/image/wxAvatar/06a367d5-ff98-4afb-9857-7ff1b98890b1.jpg
                     * userid : MFD201512265558
                     * headimgurl : http://www.ssrj.com/upload/image/wxAvatar/06a367d5-ff98-4afb-9857-7ff1b98890b1.jpg
                     * memberName : MFD201512265558
                     * memberHead : http://www.ssrj.com/upload/image/wxAvatar/06a367d5-ff98-4afb-9857-7ff1b98890b1.jpg
                     * avatars : {"mediumPath":"http://www.ssrj.com/upload/image/default_avatar_medium.jpg","thumbnailPath":"http://www.ssrj.com/upload/image/default_avatar_thumbnail.jpg","largePath":"http://www.ssrj.com/upload/image/default_avatar_large.jpg"}
                     */

                    private int id;
                    private String mobile;
                    private String name;
                    private String avatar;
                    private String userid;
                    private String headimgurl;
                    private String memberName;
                    private String memberHead;
                    private AvatarsBeanX avatars;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getMobile() {
                        return mobile;
                    }

                    public void setMobile(String mobile) {
                        this.mobile = mobile;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getAvatar() {
                        return avatar;
                    }

                    public void setAvatar(String avatar) {
                        this.avatar = avatar;
                    }

                    public String getUserid() {
                        return userid;
                    }

                    public void setUserid(String userid) {
                        this.userid = userid;
                    }

                    public String getHeadimgurl() {
                        return headimgurl;
                    }

                    public void setHeadimgurl(String headimgurl) {
                        this.headimgurl = headimgurl;
                    }

                    public String getMemberName() {
                        return memberName;
                    }

                    public void setMemberName(String memberName) {
                        this.memberName = memberName;
                    }

                    public String getMemberHead() {
                        return memberHead;
                    }

                    public void setMemberHead(String memberHead) {
                        this.memberHead = memberHead;
                    }

                    public AvatarsBeanX getAvatars() {
                        return avatars;
                    }

                    public void setAvatars(AvatarsBeanX avatars) {
                        this.avatars = avatars;
                    }

                    public static class AvatarsBeanX {
                        /**
                         * mediumPath : http://www.ssrj.com/upload/image/default_avatar_medium.jpg
                         * thumbnailPath : http://www.ssrj.com/upload/image/default_avatar_thumbnail.jpg
                         * largePath : http://www.ssrj.com/upload/image/default_avatar_large.jpg
                         */

                        private String mediumPath;
                        private String thumbnailPath;
                        private String largePath;

                        public String getMediumPath() {
                            return mediumPath;
                        }

                        public void setMediumPath(String mediumPath) {
                            this.mediumPath = mediumPath;
                        }

                        public String getThumbnailPath() {
                            return thumbnailPath;
                        }

                        public void setThumbnailPath(String thumbnailPath) {
                            this.thumbnailPath = thumbnailPath;
                        }

                        public String getLargePath() {
                            return largePath;
                        }

                        public void setLargePath(String largePath) {
                            this.largePath = largePath;
                        }
                    }
                }

                public static class MemberBean {
                    /**
                     * id : 2377
                     * mobile :
                     * name : test6
                     * avatar : http://www.ssrj.com/upload/image/wxAvatar/b670b0f7-3929-4cf9-b243-3aea68275a54.jpg
                     * userid : MFD201512265558
                     * memberName : MFD201512265558
                     * memberHead : http://www.ssrj.com/upload/image/default_avatar_thumbnail.jpg
                     * avatars : {"mediumPath":"http://www.ssrj.com/upload/image/default_avatar_medium.jpg","thumbnailPath":"http://www.ssrj.com/upload/image/default_avatar_thumbnail.jpg","largePath":"http://www.ssrj.com/upload/image/default_avatar_large.jpg"}
                     */

                    private int id;
                    private String mobile;
                    private String name;
                    private String avatar;
                    private String userid;
                    private String memberName;
                    private String memberHead;
                    private AvatarsBean avatars;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getMobile() {
                        return mobile;
                    }

                    public void setMobile(String mobile) {
                        this.mobile = mobile;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getAvatar() {
                        return avatar;
                    }

                    public void setAvatar(String avatar) {
                        this.avatar = avatar;
                    }

                    public String getUserid() {
                        return userid;
                    }

                    public void setUserid(String userid) {
                        this.userid = userid;
                    }

                    public String getMemberName() {
                        return memberName;
                    }

                    public void setMemberName(String memberName) {
                        this.memberName = memberName;
                    }

                    public String getMemberHead() {
                        return memberHead;
                    }

                    public void setMemberHead(String memberHead) {
                        this.memberHead = memberHead;
                    }

                    public AvatarsBean getAvatars() {
                        return avatars;
                    }

                    public void setAvatars(AvatarsBean avatars) {
                        this.avatars = avatars;
                    }

                    public static class AvatarsBean {
                        /**
                         * mediumPath : http://www.ssrj.com/upload/image/default_avatar_medium.jpg
                         * thumbnailPath : http://www.ssrj.com/upload/image/default_avatar_thumbnail.jpg
                         * largePath : http://www.ssrj.com/upload/image/default_avatar_large.jpg
                         */

                        private String mediumPath;
                        private String thumbnailPath;
                        private String largePath;

                        public String getMediumPath() {
                            return mediumPath;
                        }

                        public void setMediumPath(String mediumPath) {
                            this.mediumPath = mediumPath;
                        }

                        public String getThumbnailPath() {
                            return thumbnailPath;
                        }

                        public void setThumbnailPath(String thumbnailPath) {
                            this.thumbnailPath = thumbnailPath;
                        }

                        public String getLargePath() {
                            return largePath;
                        }

                        public void setLargePath(String largePath) {
                            this.largePath = largePath;
                        }
                    }
                }
            }
        }

        public static class ShareInfoBean {

            private String showUrl;
            private String title;
            private String memo;
            private String shareUrl;
            private String img;

            public String getShowUrl() {
                return showUrl;
            }

            public void setShowUrl(String showUrl) {
                this.showUrl = showUrl;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getMemo() {
                return memo;
            }

            public void setMemo(String memo) {
                this.memo = memo;
            }

            public String getShareUrl() {
                return shareUrl;
            }

            public void setShareUrl(String shareUrl) {
                this.shareUrl = shareUrl;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }
        }

        public static class CollocationListBean {
            /**
             * id : 6945
             * memo :
             * name : It Girl
             * picture : http://www.ssrj.cn/static/upload/image/2016/11/24/e88cd488-9a53-466c-9844-ab7b14456425.jpg
             * status : 1
             * draft :
             * userName : 阚阚
             * isNewProduct : false
             * isSpecialPrice : false
             * isThumbsup : false
             * memberPO : {"id":28862,"mobile":"13693215952","name":"阚阚","avatar":"http://www.ssrj.com/upload/image/wxAvatar/400285ae-b516-4d9a-b91f-83f0f30d648b.jpg","userid":"MFD2016101975748","headimgurl":"http://www.ssrj.com/upload/image/wxAvatar/400285ae-b516-4d9a-b91f-83f0f30d648b.jpg","appToken":"d65cdb2963a2a5965af92afd946c1e1d","memberName":"MFD2016101975748","memberHead":"http://www.ssrj.com/upload/image/wxAvatar/400285ae-b516-4d9a-b91f-83f0f30d648b.jpg","avatars":{"mediumPath":"http://www.ssrj.com/upload/image/default_avatar_medium.jpg","thumbnailPath":"http://www.ssrj.com/upload/image/default_avatar_thumbnail.jpg","largePath":"http://www.ssrj.com/upload/image/default_avatar_large.jpg"}}
             */

            private int id;
            private String memo;
            private String name;
            private String picture;
            private int status;
            private String draft;
            private String userName;
            private boolean isNewProduct;
            private boolean isSpecialPrice;
            private boolean isThumbsup;
            private MemberPOBean memberPO;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMemo() {
                return memo;
            }

            public void setMemo(String memo) {
                this.memo = memo;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPicture() {
                return picture;
            }

            public void setPicture(String picture) {
                this.picture = picture;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getDraft() {
                return draft;
            }

            public void setDraft(String draft) {
                this.draft = draft;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public boolean isIsNewProduct() {
                return isNewProduct;
            }

            public void setIsNewProduct(boolean isNewProduct) {
                this.isNewProduct = isNewProduct;
            }

            public boolean isIsSpecialPrice() {
                return isSpecialPrice;
            }

            public void setIsSpecialPrice(boolean isSpecialPrice) {
                this.isSpecialPrice = isSpecialPrice;
            }

            public boolean isIsThumbsup() {
                return isThumbsup;
            }

            public void setIsThumbsup(boolean isThumbsup) {
                this.isThumbsup = isThumbsup;
            }

            public MemberPOBean getMemberPO() {
                return memberPO;
            }

            public void setMemberPO(MemberPOBean memberPO) {
                this.memberPO = memberPO;
            }

            public static class MemberPOBean {
                /**
                 * id : 28862
                 * mobile : 13693215952
                 * name : 阚阚
                 * avatar : http://www.ssrj.com/upload/image/wxAvatar/400285ae-b516-4d9a-b91f-83f0f30d648b.jpg
                 * userid : MFD2016101975748
                 * headimgurl : http://www.ssrj.com/upload/image/wxAvatar/400285ae-b516-4d9a-b91f-83f0f30d648b.jpg
                 * appToken : d65cdb2963a2a5965af92afd946c1e1d
                 * memberName : MFD2016101975748
                 * memberHead : http://www.ssrj.com/upload/image/wxAvatar/400285ae-b516-4d9a-b91f-83f0f30d648b.jpg
                 * avatars : {"mediumPath":"http://www.ssrj.com/upload/image/default_avatar_medium.jpg","thumbnailPath":"http://www.ssrj.com/upload/image/default_avatar_thumbnail.jpg","largePath":"http://www.ssrj.com/upload/image/default_avatar_large.jpg"}
                 */

                private int id;
                private String mobile;
                private String name;
                private String avatar;
                private String userid;
                private String headimgurl;
                private String appToken;
                private String memberName;
                private String memberHead;
                private AvatarsBeanX avatars;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getMobile() {
                    return mobile;
                }

                public void setMobile(String mobile) {
                    this.mobile = mobile;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getAvatar() {
                    return avatar;
                }

                public void setAvatar(String avatar) {
                    this.avatar = avatar;
                }

                public String getUserid() {
                    return userid;
                }

                public void setUserid(String userid) {
                    this.userid = userid;
                }

                public String getHeadimgurl() {
                    return headimgurl;
                }

                public void setHeadimgurl(String headimgurl) {
                    this.headimgurl = headimgurl;
                }

                public String getAppToken() {
                    return appToken;
                }

                public void setAppToken(String appToken) {
                    this.appToken = appToken;
                }

                public String getMemberName() {
                    return memberName;
                }

                public void setMemberName(String memberName) {
                    this.memberName = memberName;
                }

                public String getMemberHead() {
                    return memberHead;
                }

                public void setMemberHead(String memberHead) {
                    this.memberHead = memberHead;
                }

                public AvatarsBeanX getAvatars() {
                    return avatars;
                }

                public void setAvatars(AvatarsBeanX avatars) {
                    this.avatars = avatars;
                }

                public static class AvatarsBeanX {
                    /**
                     * mediumPath : http://www.ssrj.com/upload/image/default_avatar_medium.jpg
                     * thumbnailPath : http://www.ssrj.com/upload/image/default_avatar_thumbnail.jpg
                     * largePath : http://www.ssrj.com/upload/image/default_avatar_large.jpg
                     */

                    private String mediumPath;
                    private String thumbnailPath;
                    private String largePath;

                    public String getMediumPath() {
                        return mediumPath;
                    }

                    public void setMediumPath(String mediumPath) {
                        this.mediumPath = mediumPath;
                    }

                    public String getThumbnailPath() {
                        return thumbnailPath;
                    }

                    public void setThumbnailPath(String thumbnailPath) {
                        this.thumbnailPath = thumbnailPath;
                    }

                    public String getLargePath() {
                        return largePath;
                    }

                    public void setLargePath(String largePath) {
                        this.largePath = largePath;
                    }
                }
            }
        }

        public static class MemberListBean {
            /**
             * id : 28862
             * mobile : 13693215952
             * name : 阚阚
             * avatar : http://www.ssrj.com/upload/image/wxAvatar/400285ae-b516-4d9a-b91f-83f0f30d648b.jpg
             * userid : MFD2016101975748
             * headimgurl : http://www.ssrj.com/upload/image/wxAvatar/400285ae-b516-4d9a-b91f-83f0f30d648b.jpg
             * appToken : d65cdb2963a2a5965af92afd946c1e1d
             * memberName : MFD2016101975748
             * memberHead : http://www.ssrj.com/upload/image/wxAvatar/400285ae-b516-4d9a-b91f-83f0f30d648b.jpg
             * avatars : {"mediumPath":"http://www.ssrj.com/upload/image/default_avatar_medium.jpg","thumbnailPath":"http://www.ssrj.com/upload/image/default_avatar_thumbnail.jpg","largePath":"http://www.ssrj.com/upload/image/default_avatar_large.jpg"}
             */

            private int id;
            private String mobile;
            private String name;
            private String avatar;
            private String userid;
            private String headimgurl;
            private String appToken;
            private String memberName;
            private String memberHead;
            private AvatarsBeanXX avatars;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getUserid() {
                return userid;
            }

            public void setUserid(String userid) {
                this.userid = userid;
            }

            public String getHeadimgurl() {
                return headimgurl;
            }

            public void setHeadimgurl(String headimgurl) {
                this.headimgurl = headimgurl;
            }

            public String getAppToken() {
                return appToken;
            }

            public void setAppToken(String appToken) {
                this.appToken = appToken;
            }

            public String getMemberName() {
                return memberName;
            }

            public void setMemberName(String memberName) {
                this.memberName = memberName;
            }

            public String getMemberHead() {
                return memberHead;
            }

            public void setMemberHead(String memberHead) {
                this.memberHead = memberHead;
            }

            public AvatarsBeanXX getAvatars() {
                return avatars;
            }

            public void setAvatars(AvatarsBeanXX avatars) {
                this.avatars = avatars;
            }

            public static class AvatarsBeanXX {
                /**
                 * mediumPath : http://www.ssrj.com/upload/image/default_avatar_medium.jpg
                 * thumbnailPath : http://www.ssrj.com/upload/image/default_avatar_thumbnail.jpg
                 * largePath : http://www.ssrj.com/upload/image/default_avatar_large.jpg
                 */

                private String mediumPath;
                private String thumbnailPath;
                private String largePath;

                public String getMediumPath() {
                    return mediumPath;
                }

                public void setMediumPath(String mediumPath) {
                    this.mediumPath = mediumPath;
                }

                public String getThumbnailPath() {
                    return thumbnailPath;
                }

                public void setThumbnailPath(String thumbnailPath) {
                    this.thumbnailPath = thumbnailPath;
                }

                public String getLargePath() {
                    return largePath;
                }

                public void setLargePath(String largePath) {
                    this.largePath = largePath;
                }
            }
        }
    }
}