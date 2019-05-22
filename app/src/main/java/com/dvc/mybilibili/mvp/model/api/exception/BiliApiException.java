package com.dvc.mybilibili.mvp.model.api.exception;

import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;

/* compiled from: BL */
public class BiliApiException extends Exception {
    public static final int E_ACCESS_DENIED = -403;
    public static final int E_ACCESS_KEY_INVALID = -2;
    public static final int E_ACCESS_TOKEN_EXPIRED = -658;
    public static final int E_ACCOUNT_IS_BANNDED = -102;
    public static final int E_ACCOUNT_IS_NOT_LOGIN = -101;
    public static final int E_ACCOUNT_IS_NOT_LOGIN_OAUTH = 61000;
    public static final int E_ACCOUNT_NEED_VERIFY = -2100;
    public static final int E_ACTIVE_COUNT_TRIGGLE_LIMITS = -624;
    public static final int E_ACTIVITY_GIFT_LACKED = -612;
    public static final int E_ADMIN_APPLY_DUMPLICATE = -801;
    public static final int E_ADMIN_APPLY_NOT_EXIST = -800;
    public static final int E_ADMIN_CAN_NOT_QUIT_COMMUNITY = -712;
    public static final int E_ADMIN_POSITION_IS_FULL = -605;
    public static final int E_AGREEMENT_DISAGREEMENT_THE_FEEDBACK_AGAINS = -614;
    public static final int E_ALL_CODE_HAS_BEEN_SENT = -631;
    public static final int E_API_SIGN_INVALID = -3;
    public static final int E_APPLICATION_NOT_EXISTS_OR_IS_BANDED = -1;
    public static final int E_BEGIN_DATE_FORMAT_ERROR = -601;
    public static final int E_BEGIN_DATE_TO_END_DATE_SELECT_TOO_LARGE = -603;
    public static final int E_CAPTCHA_EXPIRED = -650;
    public static final int E_CAPTCHA_IS_NOT_ACTIVATED = -106;
    public static final int E_CAPTCHA_IS_NOT_MATCH = -105;
    public static final int E_CAPTCHA_SEND_FAILED = -648;
    public static final int E_CARD_IS_GIVEN_AWAY = -203;
    public static final int E_CD_TIME_CAN_NOT_REPORT_IT = 12019;
    public static final int E_CD_TIME_NOT_TO_COMMENT = 12014;
    public static final int E_COINS_IS_NOT_ENOUGH = -104;
    public static final int E_COINS_NOT_ENOUGH = -655;
    public static final int E_COMMENT_BLACKLIST_LIMIT = 12035;
    public static final int E_COMMENT_LENGTH_LIMITED = 12025;
    public static final int E_COMMENT_NEED_LV2 = -650;
    public static final int E_COMMENT_NEED_TO_REVIEW = 12017;
    public static final int E_COMMENT_ON_CONTENT_FILTERING_TO_SENSITIVE_WORDS = 12016;
    public static final int E_COMMENT_TOO_MANY_EMOTICON = 12032;
    public static final int E_COMMENT_VIP_BANNED = 12033;
    public static final int E_COMMUNITY_IN_PRISON = -105;
    public static final int E_COMMUNITY_IS_BANNED = -102;
    public static final int E_COMMUNITY_IS_EXISTS = -604;
    public static final int E_COMMUNITY_MEMBERS_IS_FULL = -608;
    public static final int E_COMMUNITY_NOT_ACTIVATE = -103;
    public static final int E_COMMUNITY_NOT_ALLOW_JOIN = -606;
    public static final int E_COMMUNITY_NOT_ALLOW_TALK = -104;
    public static final int E_COMMUNITY_NOT_EXISTS = -603;
    public static final int E_COMMUNITY_NOT_LOGIN = -101;
    public static final int E_COMMUNITY_NOT_OFFICIAL = -107;
    public static final int E_COMMUNITY_ONLY_FORMAL_CAN_JOIN = -607;
    public static final int E_CONTENT_HAVE_CONTAIN_UNALLOW_KEYWORDS = -1008;
    public static final int E_CONTENT_IS_TOO_LONG = -1010;
    public static final int E_CONTENT_NOT_MODIFY = -304;
    public static final int E_CREDITS_IS_NOT_ENOUGH = -103;
    public static final int E_CURRENT_STATE_CANNOT_PERFORM_THE_USER_ACTION = 12018;
    public static final int E_DAYS_SELECT_TOO_LARGE = -605;
    public static final int E_DELETE_POST_COUNT_OVER_LIMIT = -721;
    public static final int E_DOCUMENT_IS_NOT_EXISTS = -404;
    public static final int E_EMAIL_EXISTS = -622;
    public static final int E_EMAIL_FORMAT_ERROR = -621;
    public static final int E_END_DATE_FORMAT_ERROR = -602;
    public static final int E_EXISTING_REVIEW_TOPICS = 12001;
    public static final int E_FAIL = -1;
    public static final int E_FAVORITE_FOLDER_NOT_EXIST = 11010;
    public static final int E_FAVORITE_LIST_IS_FULL = -1;
    public static final int E_FAVORITE_VIDEO_EXIST = 11007;
    public static final int E_FAVORITE_VIDEO_SIZE_LIMITED = 11005;
    public static final int E_FILENAME_IS_NOT_EXISTS = -1003;
    public static final int E_FILESIZE_RROR = -1005;
    public static final int E_FILE_UPLOAD_IS_NOT_A_VALID_IMAGE = -616;
    public static final int E_FILE_UPLOAD_OVERSIZED = -617;
    public static final int E_FONTSIZE_INVALID = -1006;
    public static final int E_FORBIDDEN_TO_REPORT = 12005;
    public static final int E_FORBID_USER_COUNT_OVER_LIMIT = -720;
    public static final int E_GAME_NOT_ACTIVEABLE = -623;
    public static final int E_HAS_BEEN_DELETED = 12022;
    public static final int E_HAS_BEEN_OPERATING = 12007;
    public static final int E_HAVE_TO_REPORT = 12008;
    public static final int E_HIDE_SHOW_THE_FEEDBACK_FAILED = -615;
    public static final int E_ILLEGAL_FATHER_COMMENTS = 12010;
    public static final int E_ILLEGAL_PARAMETER = 12009;
    public static final int E_ILLEGAL_TO_REPORT = 12012;
    public static final int E_ILLEGAL__PRAISE = 12011;
    public static final int E_IMAGE_NOT_EXISTS = -690;
    public static final int E_IMAGE_TYPE_UNRIGHT = -950;
    public static final int E_IMAGE_UPLOAD_FAILED = -951;
    public static final int E_INDEX_IS_EXISTS = -1002;
    public static final int E_INDEX_IS_NOT_EXISTS_ON_DB = -1001;
    public static final int E_INFORM_PEOPLE_TOO_MUCH = 12013;
    public static final int E_IN_A_SHORT_PERIOD_OF_TIME_CAN_NOT_REPEAT_COMMENT = 12023;
    public static final int E_IN_MAINTENANCE = -444;
    public static final int E_LIVE_ROOM_IP_INVALID = -614;
    public static final int E_LIVE_ROOM_LOCKED = -613;
    public static final int E_LIVE_ROOM_NOT_EXIST = -404;
    public static final int E_LIVE_SILVER_RECEIVE_CONDITION_NOT_MATCH = -99;
    public static final int E_LIVE_SILVER_RECEIVE_FINISHED = -10017;
    public static final int E_LOTTERY_IS_END = -202;
    public static final int E_LOTTERY_IS_ENDED = -630;
    public static final int E_LOTTERY_IS_NOT_START = -629;
    public static final int E_LOTTERY_IS_NOT_STARTED = -201;
    public static final int E_MD5_ERROR = -1004;
    public static final int E_MODE_INVALID = -1007;
    public static final int E_MODIFY_PERSON_INFO_INVALID = -653;
    public static final int E_MODIFY_PERSON_SIGNATURE_PARAM_INVALID = -1001;
    public static final int E_NICKNAME_UPDATE_LOCKED = -707;
    public static final int E_NO_PERMISSION_FOR_MANAGE = -612;
    public static final int E_OBTAIN_USER_INFO_FAILED = -750;
    public static final int E_ORDER_METHOD_ERROR = -606;
    public static final int E_OVERFLOW_FOR_POOL = -613;
    public static final int E_OVERSPEED = -503;
    public static final int E_OVER_MAX_FAVORITES_COUNT = -607;
    public static final int E_PACKAGE_LACKED = -612;
    public static final int E_PASSPORT_ACCESS_TOKEN_EXPIRED = -904;
    public static final int E_PASSPORT_ACCESS_TOKEN_NOT_EXIST = -901;
    public static final int E_PASSPORT_PASSWORD_ERROR = -629;
    public static final int E_PASSPORT_REFRESH_TOKEN_EXPIRED = -905;
    public static final int E_PASSPORT_REFRESH_TOKEN_NOT_EXIST = -902;
    public static final int E_PASSPORT_TOKEN_NOT_MATCH = -903;
    public static final int E_PASSWORD_ERROR = -627;
    public static final int E_PASSWORD_IS_LEAKED = -628;
    public static final int E_PASSWORD_RETRIED_TOO_MANY_TIMES = -625;
    public static final int E_PHONE_NUM_CONFLICT_WIDTH_USERNAME = -652;
    public static final int E_PHONE_NUM_EXISTS = -647;
    public static final int E_PHONE_NUM_FORMAT_INVALID = -649;
    public static final int E_PHONE_NUM_IS_BOUND = -651;
    public static final int E_PHONE_NUM_IS_INVALID = -646;
    public static final int E_PINYIN_IS_NOT_INPUT = -604;
    public static final int E_PLAYTIME_ERROR = -1011;
    public static final int E_POST_HAVE_COLLECTED = -651;
    public static final int E_POST_NOT_EXISTS = -650;
    public static final int E_POST_REPLAY_COUNT_OVER_LIMIT_CAN_NOT_DELETE = -722;
    public static final int E_PROHIBIT_COMMENTS = 12002;
    public static final int E_PROHIBIT_OPERATION = 12004;
    public static final int E_PROHIBIT_TO_REPLY = 12003;
    public static final int E_QRCODE_NOENTITY_OR_EXPIRED = -800;
    public static final int E_REPLY_NOT_EXISTS = -680;
    public static final int E_REPORT_DOES_NOT_EXIST = 12020;
    public static final int E_REQUEST_ERROR = -400;
    public static final int E_SEARCH_SESSION_IS_EXISTS = -502;
    public static final int E_SERVER_INTERNAL_ERROR = -500;
    public static final int E_SMS_CODE_NOT_RIGHT = -900;
    public static final int E_SMS_CODE_TOO_FREQUENTLY = -901;
    public static final int E_SUBSCRIBE_NUM_LIMIT = 16004;
    public static final int E_SYSTEM_ACCOUNTS_CAN_NOT_ATTENTION = -609;
    public static final int E_SYSTEM_ERROR = -501;
    public static final int E_THE_REPORT_HAS_BEEN_PROCESSING = 12021;
    public static final int E_TOPIC_NOT_EXIST = -1112;
    public static final int E_UANME_OR_PASSWORD_TOO_SHORT = -645;
    public static final int E_USERNAME_EXISTS = -620;
    public static final int E_USERNAME_FORMAT_ERROR = -618;
    public static final int E_USERNAME_TOO_LONG = -619;
    public static final int E_USER_ALREADY_IS_ADMIN = -708;
    public static final int E_USER_APPLY_COUNT_OVER_LIMIT = -705;
    public static final int E_USER_APPLY_NOT_ACHIEVED_DEMAND = -710;
    public static final int E_USER_CAN_NOT_APPLY_LOW_LEVEL_POSITION = -709;
    public static final int E_USER_HAS_NO_PERMISSION = -704;
    public static final int E_USER_HAVE_BEEN_FORBIDDEN = -703;
    public static final int E_USER_HAVE_JOIN_COMMUNITY = -701;
    public static final int E_USER_HAVE_SUPPORTED = -707;
    public static final int E_USER_IS_NOT_EXISTS = -626;
    public static final int E_USER_IS_REPLYING_ADMIN_CAN_NOT_QUIT_COMMUNITY = -711;
    public static final int E_USER_NOT_BIND_PHONE = -706;
    public static final int E_USER_NOT_IN_COMMUNITY = -702;
    public static final int E_VERIFICATION_CODE_ERROR_NOT_TO_COMMENT = 12015;
    public static final int E_VIDEO_IS_REPEAT = -307;
    public static final int E_VIDEO_NOT_EXIST = -1111;
    public static final int E_WITHOUT_THE_COMMENT = 12006;
    public static final int E_YOU_CAN_NOT_ADD_MYSELF_TO_ATTENTIONS = -608;
    public static final int E_YOU_HAVE_ATTENTION_TOO_MANY_USERS = -611;
    public static final int E_YOU_HAVE_BANNED_BY_USER = -610;
    public static final int E_YOU_HAVE_BEEN_BANNED = -1009;
    public static final int S_OK = 0;
    private static final long serialVersionUID = -4032549134925259473L;
    public int mCode = -1;
    public GeneralResponse generalResponse;

    public BiliApiException(String str) {
        super(str);
    }

    public BiliApiException(int i) {
        this.mCode = i;
    }

    public BiliApiException(GeneralResponse generalResponse) {
        super(generalResponse.message);
        this.mCode = generalResponse.code;
        this.generalResponse =generalResponse;
    }

    public BiliApiException(int i, String str) {
        super(str);
        this.mCode = i;
    }

    public BiliApiException(int i, String str, Throwable th) {
        super(str, th);
        this.mCode = i;
    }

    public BiliApiException(Throwable th) {
        super(th);
    }

    public boolean canRetry() {
        int i = this.mCode;
        if (!(i == E_OVERSPEED || i == -101)) {
            switch (i) {
                case -404:
                case E_ACCESS_DENIED /*-403*/:
                    break;
                default:
                    return true;
            }
        }
        return false;
    }

    public boolean isAuthStateError() {
        return this.mCode == -2 || this.mCode == -101;
    }

    public boolean isTokenExpired() {
        return this.mCode == E_ACCESS_TOKEN_EXPIRED || this.mCode == E_PASSPORT_ACCESS_TOKEN_EXPIRED;
    }
}
