package com.example.john.testrecycleyview.entity;

import java.util.List;

/**
 * Created by Administrator on 16-1-15.
 */
public class SouSuoResultEntity {


    /**
     * code : 1
     * data : {"stateCode":1,"message":"成功","returnData":{"comicNum":2,"comicList":[{"comic_id":14325,"name":"长歌行","cover":"http://cover2.u17i.com/2012/02/108005_1330077408_3j1MZQMJIKZ4.big.jpg","accredit":1,"last_update_time":1452736801,"last_update_chapter_name":"第五十二章.02","description":"玄武门之变后，唐都长安暗流汹涌。","user_id":108005,"nickname":"夏达","series_status":"0","theme_ids":"7","is_vip":"0","chapter_num":"111","is_dujia":1,"tags":["战争"],"extraValue":"总点击 7.9亿","click_total":"7.9亿"},{"comic_id":93932,"name":"梦中客 长歌行同人","cover":"http://cover2.u17i.com/2015/04/5071476_1428938341_C8CC7yEVyhdh.big.jpg","accredit":0,"last_update_time":1428975760,"last_update_chapter_name":"8P未完","description":"《长歌行》同人，长歌X弥弥。怀念弥弥的产物。内容大概是多年后的长歌做了一个梦。","user_id":5071476,"nickname":"豌豆豌","series_status":"0","theme_ids":"12","is_vip":"0","chapter_num":"2","is_dujia":0,"tags":["同人"],"extraValue":"总点击 24.3万","click_total":"24.3万"}]}}
     */

    private int code;
    /**
     * stateCode : 1
     * message : 成功
     * returnData : {"comicNum":2,"comicList":[{"comic_id":14325,"name":"长歌行","cover":"http://cover2.u17i.com/2012/02/108005_1330077408_3j1MZQMJIKZ4.big.jpg","accredit":1,"last_update_time":1452736801,"last_update_chapter_name":"第五十二章.02","description":"玄武门之变后，唐都长安暗流汹涌。","user_id":108005,"nickname":"夏达","series_status":"0","theme_ids":"7","is_vip":"0","chapter_num":"111","is_dujia":1,"tags":["战争"],"extraValue":"总点击 7.9亿","click_total":"7.9亿"},{"comic_id":93932,"name":"梦中客 长歌行同人","cover":"http://cover2.u17i.com/2015/04/5071476_1428938341_C8CC7yEVyhdh.big.jpg","accredit":0,"last_update_time":1428975760,"last_update_chapter_name":"8P未完","description":"《长歌行》同人，长歌X弥弥。怀念弥弥的产物。内容大概是多年后的长歌做了一个梦。","user_id":5071476,"nickname":"豌豆豌","series_status":"0","theme_ids":"12","is_vip":"0","chapter_num":"2","is_dujia":0,"tags":["同人"],"extraValue":"总点击 24.3万","click_total":"24.3万"}]}
     */

    private DataEntity data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public static class DataEntity {
        private int stateCode;
        private String message;
        /**
         * comicNum : 2
         * comicList : [{"comic_id":14325,"name":"长歌行","cover":"http://cover2.u17i.com/2012/02/108005_1330077408_3j1MZQMJIKZ4.big.jpg","accredit":1,"last_update_time":1452736801,"last_update_chapter_name":"第五十二章.02","description":"玄武门之变后，唐都长安暗流汹涌。","user_id":108005,"nickname":"夏达","series_status":"0","theme_ids":"7","is_vip":"0","chapter_num":"111","is_dujia":1,"tags":["战争"],"extraValue":"总点击 7.9亿","click_total":"7.9亿"},{"comic_id":93932,"name":"梦中客 长歌行同人","cover":"http://cover2.u17i.com/2015/04/5071476_1428938341_C8CC7yEVyhdh.big.jpg","accredit":0,"last_update_time":1428975760,"last_update_chapter_name":"8P未完","description":"《长歌行》同人，长歌X弥弥。怀念弥弥的产物。内容大概是多年后的长歌做了一个梦。","user_id":5071476,"nickname":"豌豆豌","series_status":"0","theme_ids":"12","is_vip":"0","chapter_num":"2","is_dujia":0,"tags":["同人"],"extraValue":"总点击 24.3万","click_total":"24.3万"}]
         */

        private ReturnDataEntity returnData;

        public int getStateCode() {
            return stateCode;
        }

        public void setStateCode(int stateCode) {
            this.stateCode = stateCode;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public ReturnDataEntity getReturnData() {
            return returnData;
        }

        public void setReturnData(ReturnDataEntity returnData) {
            this.returnData = returnData;
        }

        public static class ReturnDataEntity {
            private int comicNum;
            /**
             * comic_id : 14325
             * name : 长歌行
             * cover : http://cover2.u17i.com/2012/02/108005_1330077408_3j1MZQMJIKZ4.big.jpg
             * accredit : 1
             * last_update_time : 1452736801
             * last_update_chapter_name : 第五十二章.02
             * description : 玄武门之变后，唐都长安暗流汹涌。
             * user_id : 108005
             * nickname : 夏达
             * series_status : 0
             * theme_ids : 7
             * is_vip : 0
             * chapter_num : 111
             * is_dujia : 1
             * tags : ["战争"]
             * extraValue : 总点击 7.9亿
             * click_total : 7.9亿
             */

            private List<ComicListEntity> comicList;

            public int getComicNum() {
                return comicNum;
            }

            public void setComicNum(int comicNum) {
                this.comicNum = comicNum;
            }

            public List<ComicListEntity> getComicList() {
                return comicList;
            }

            public void setComicList(List<ComicListEntity> comicList) {
                this.comicList = comicList;
            }

            public static class ComicListEntity {
                private int comic_id;
                private String name;
                private String cover;
                private int accredit;
                private int last_update_time;
                private String last_update_chapter_name;
                private String description;
                private int user_id;
                private String nickname;
                private String series_status;
                private String theme_ids;
                private String is_vip;
                private String chapter_num;
                private int is_dujia;
                private String extraValue;
                private String click_total;
                private List<String> tags;

                public int getComic_id() {
                    return comic_id;
                }

                public void setComic_id(int comic_id) {
                    this.comic_id = comic_id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public int getAccredit() {
                    return accredit;
                }

                public void setAccredit(int accredit) {
                    this.accredit = accredit;
                }

                public int getLast_update_time() {
                    return last_update_time;
                }

                public void setLast_update_time(int last_update_time) {
                    this.last_update_time = last_update_time;
                }

                public String getLast_update_chapter_name() {
                    return last_update_chapter_name;
                }

                public void setLast_update_chapter_name(String last_update_chapter_name) {
                    this.last_update_chapter_name = last_update_chapter_name;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public int getUser_id() {
                    return user_id;
                }

                public void setUser_id(int user_id) {
                    this.user_id = user_id;
                }

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public String getSeries_status() {
                    return series_status;
                }

                public void setSeries_status(String series_status) {
                    this.series_status = series_status;
                }

                public String getTheme_ids() {
                    return theme_ids;
                }

                public void setTheme_ids(String theme_ids) {
                    this.theme_ids = theme_ids;
                }

                public String getIs_vip() {
                    return is_vip;
                }

                public void setIs_vip(String is_vip) {
                    this.is_vip = is_vip;
                }

                public String getChapter_num() {
                    return chapter_num;
                }

                public void setChapter_num(String chapter_num) {
                    this.chapter_num = chapter_num;
                }

                public int getIs_dujia() {
                    return is_dujia;
                }

                public void setIs_dujia(int is_dujia) {
                    this.is_dujia = is_dujia;
                }

                public String getExtraValue() {
                    return extraValue;
                }

                public void setExtraValue(String extraValue) {
                    this.extraValue = extraValue;
                }

                public String getClick_total() {
                    return click_total;
                }

                public void setClick_total(String click_total) {
                    this.click_total = click_total;
                }

                public List<String> getTags() {
                    return tags;
                }

                public void setTags(List<String> tags) {
                    this.tags = tags;
                }

                @Override
                public String toString() {
                    return "ComicListEntity{" +
                            "comic_id=" + comic_id +
                            ", name='" + name + '\'' +
                            ", cover='" + cover + '\'' +
                            ", accredit=" + accredit +
                            ", last_update_time=" + last_update_time +
                            ", last_update_chapter_name='" + last_update_chapter_name + '\'' +
                            ", description='" + description + '\'' +
                            ", user_id=" + user_id +
                            ", nickname='" + nickname + '\'' +
                            ", series_status='" + series_status + '\'' +
                            ", theme_ids='" + theme_ids + '\'' +
                            ", is_vip='" + is_vip + '\'' +
                            ", chapter_num='" + chapter_num + '\'' +
                            ", is_dujia=" + is_dujia +
                            ", extraValue='" + extraValue + '\'' +
                            ", click_total='" + click_total + '\'' +
                            ", tags=" + tags +
                            '}';
                }
            }
        }
    }
}
