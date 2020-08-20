/**
 * @author 22734
 */
public class MainChannelRule {

    public static void main(String[] args) {
        String sign = "TOUTIAO";
        ChannelRuleEnum channelRule = ChannelRuleEnum.match(sign);
        ChannelRule rule = channelRule.getChannel();
        rule.process();
    }
}
