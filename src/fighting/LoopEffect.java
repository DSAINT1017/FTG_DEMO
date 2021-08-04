package fighting;

import image.Image;

/**
 * 波動拳のエフェクトを管理するクラス. 管理波動全效果的class
 * Effectクラスを継承している. 繼承自Effect
 */
public class LoopEffect extends Effect {

	/**
	 * 指定されたデータでLoopEffectのインスタンスを作成するクラスコンストラクタ．
	 *
	 * @param attack
	 *            攻撃オブジェクト
	 * @param hitImages
	 *            攻撃オブジェクトに対応する全てのエフェクト画像
	 */
	public LoopEffect(Attack attack, Image[] hitImages) {
		super(attack, hitImages);
	}

	/**
	 * Updates the effect's state.<br>
	 * If effect display time has elapsed, set the elapsed frame to 0;
	 *
	 * @return {@code true}
	 */
	public boolean update() {
		if (!super.update()) {
			this.currentFrame = 0;
		}

		return true;
	}

}
