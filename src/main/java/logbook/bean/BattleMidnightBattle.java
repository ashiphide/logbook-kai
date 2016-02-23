package logbook.bean;

import java.util.List;

import javax.json.JsonObject;

import logbook.internal.JsonHelper;

/**
 * 戦闘
 *
 */
public class BattleMidnightBattle {

    /** api_dock_id/api_deck_id */
    private Integer dockId;

    /** api_ship_ke */
    private List<Integer> shipKe;

    /** api_ship_lv */
    private List<Integer> shipLv;

    /** api_nowhps */
    private List<Integer> nowhps;

    /** api_maxhps */
    private List<Integer> maxhps;

    /** api_eSlot */
    private List<List<Integer>> eSlot;

    /** api_eKyouka */
    private List<List<Integer>> eKyouka;

    /** api_fParam */
    private List<List<Integer>> fParam;

    /** api_eParam */
    private List<List<Integer>> eParam;

    /** api_touch_plane */
    private List<Integer> touchPlane;

    /** api_flare_pos */
    private List<Integer> flarePos;

    /** api_hougeki */
    private BattleTypes.MidnightHougeki hougeki;

    /**
     * api_dock_id/api_deck_idを取得します。
     * @return api_dock_id/api_deck_id
     */
    public Integer getDockId() {
        return this.dockId;
    }

    /**
     * api_dock_id/api_deck_idを設定します。
     * @param dockId api_dock_id/api_deck_id
     */
    public void setDockId(Integer dockId) {
        this.dockId = dockId;
    }

    /**
     * api_ship_keを取得します。
     * @return api_ship_ke
     */
    public List<Integer> getShipKe() {
        return this.shipKe;
    }

    /**
     * api_ship_keを設定します。
     * @param shipKe api_ship_ke
     */
    public void setShipKe(List<Integer> shipKe) {
        this.shipKe = shipKe;
    }

    /**
     * api_ship_lvを取得します。
     * @return api_ship_lv
     */
    public List<Integer> getShipLv() {
        return this.shipLv;
    }

    /**
     * api_ship_lvを設定します。
     * @param shipLv api_ship_lv
     */
    public void setShipLv(List<Integer> shipLv) {
        this.shipLv = shipLv;
    }

    /**
     * api_nowhpsを取得します。
     * @return api_nowhps
     */
    public List<Integer> getNowhps() {
        return this.nowhps;
    }

    /**
     * api_nowhpsを設定します。
     * @param nowhps api_nowhps
     */
    public void setNowhps(List<Integer> nowhps) {
        this.nowhps = nowhps;
    }

    /**
     * api_maxhpsを取得します。
     * @return api_maxhps
     */
    public List<Integer> getMaxhps() {
        return this.maxhps;
    }

    /**
     * api_maxhpsを設定します。
     * @param maxhps api_maxhps
     */
    public void setMaxhps(List<Integer> maxhps) {
        this.maxhps = maxhps;
    }

    /**
     * api_eSlotを取得します。
     * @return api_eSlot
     */
    public List<List<Integer>> geteSlot() {
        return this.eSlot;
    }

    /**
     * api_eSlotを設定します。
     * @param eSlot api_eSlot
     */
    public void seteSlot(List<List<Integer>> eSlot) {
        this.eSlot = eSlot;
    }

    /**
     * api_eKyoukaを取得します。
     * @return api_eKyouka
     */
    public List<List<Integer>> geteKyouka() {
        return this.eKyouka;
    }

    /**
     * api_eKyoukaを設定します。
     * @param eKyouka api_eKyouka
     */
    public void seteKyouka(List<List<Integer>> eKyouka) {
        this.eKyouka = eKyouka;
    }

    /**
     * api_fParamを取得します。
     * @return api_fParam
     */
    public List<List<Integer>> getfParam() {
        return this.fParam;
    }

    /**
     * api_fParamを設定します。
     * @param fParam api_fParam
     */
    public void setfParam(List<List<Integer>> fParam) {
        this.fParam = fParam;
    }

    /**
     * api_eParamを取得します。
     * @return api_eParam
     */
    public List<List<Integer>> geteParam() {
        return this.eParam;
    }

    /**
     * api_eParamを設定します。
     * @param eParam api_eParam
     */
    public void seteParam(List<List<Integer>> eParam) {
        this.eParam = eParam;
    }

    /**
     * api_touch_planeを取得します。
     * @return api_touch_plane
     */
    public List<Integer> getTouchPlane() {
        return this.touchPlane;
    }

    /**
     * api_touch_planeを設定します。
     * @param touchPlane api_touch_plane
     */
    public void setTouchPlane(List<Integer> touchPlane) {
        this.touchPlane = touchPlane;
    }

    /**
     * api_flare_posを取得します。
     * @return api_flare_pos
     */
    public List<Integer> getFlarePos() {
        return this.flarePos;
    }

    /**
     * api_flare_posを設定します。
     * @param flarePos api_flare_pos
     */
    public void setFlarePos(List<Integer> flarePos) {
        this.flarePos = flarePos;
    }

    /**
     * api_hougekiを取得します。
     * @return api_hougeki
     */
    public BattleTypes.MidnightHougeki getHougeki() {
        return this.hougeki;
    }

    /**
     * api_hougekiを設定します。
     * @param hougeki api_hougeki
     */
    public void setHougeki(BattleTypes.MidnightHougeki hougeki) {
        this.hougeki = hougeki;
    }

    /**
     * JsonObjectから{@link BattleMidnightBattle}を構築します
     *
     * @param json JsonObject
     * @return {@link BattleMidnightBattle}
     */
    public static BattleMidnightBattle toBattle(JsonObject json) {
        BattleMidnightBattle bean = new BattleMidnightBattle();
        JsonHelper.bind(json)
                .setInteger("api_dock_id", bean::setDockId)
                .setInteger("api_deck_id", bean::setDockId)
                .set("api_ship_ke", bean::setShipKe, JsonHelper::toIntegerList)
                .set("api_ship_lv", bean::setShipLv, JsonHelper::toIntegerList)
                .set("api_nowhps", bean::setNowhps, JsonHelper::toIntegerList)
                .set("api_maxhps", bean::setMaxhps, JsonHelper::toIntegerList)
                .set("api_eSlot", bean::seteSlot, JsonHelper.toList(JsonHelper::toIntegerList))
                .set("api_eKyouka", bean::seteKyouka, JsonHelper.toList(JsonHelper::toIntegerList))
                .set("api_fParam", bean::setfParam, JsonHelper.toList(JsonHelper::toIntegerList))
                .set("api_eParam", bean::seteParam, JsonHelper.toList(JsonHelper::toIntegerList))
                .set("api_touch_plane", bean::setTouchPlane, JsonHelper::toIntegerList)
                .set("api_flare_pos", bean::setFlarePos, JsonHelper::toIntegerList)
                .set("api_hougeki", bean::setHougeki, BattleTypes.MidnightHougeki::toMidnightHougeki);
        return bean;
    }
}
