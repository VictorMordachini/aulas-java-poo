package com.senai.aula08_projeto_mqtt_mysql_websocket.mqtt;


import com.senai.aula08_projeto_mqtt_mysql_websocket.controller.ControleDeAcessoController;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class MqttSubscriber {
    private static final String BROKER = "tcp://localhost:1883";
    private static final String CLIENT_ID = "ServidorJava";
    private static final String TOPICO = "catraca/rfid";
    private static final ControleDeAcessoController controller = new ControleDeAcessoController();

    public static void iniciarMqtt() {
        try {
            MqttClient client = new MqttClient(BROKER, CLIENT_ID);
            client.connect();
            client.subscribe(TOPICO, (topic, msg) -> {
                String payload = new String(msg.getPayload());
                String resposta = controller.processarEntrada(payload);
                System.out.println(resposta); // este será redirecionado para a view em um próximo passo, se necessário
            });
            System.out.println("Inscrito no tópico MQTT: " + TOPICO);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
}

