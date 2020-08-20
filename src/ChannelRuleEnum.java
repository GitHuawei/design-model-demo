/**
 * @author 22734
 */

public enum ChannelRuleEnum {

    /**
     * 头条
     */
    TOUTIAO("TOUTIAO", new TouTiaoChannelRule()),

    /**
     * 腾讯
     */
    TENCENT("TENCENT", new TencentChannelRule());

    private final String name;

    protected ChannelRule channel;

    ChannelRuleEnum(String name, ChannelRule channel) {
        this.name = name;
        this.channel = channel;
    }

    /**
     * 匹配
     *
     * @param name
     * @return
     */
    public static ChannelRuleEnum match(String name) {
        ChannelRuleEnum[] values = ChannelRuleEnum.values();
        for (ChannelRuleEnum value : values) {
            if (value.getName().equals(name)) {
                return value;
            }
        }
        throw new IllegalArgumentException("unsupported channelRule：" + name);
    }

    public String getName() {
        return name;
    }

    public ChannelRule getChannel() {
        return channel;
    }
}