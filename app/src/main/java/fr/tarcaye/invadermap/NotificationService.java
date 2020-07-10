package fr.tarcaye.invadermap;

import com.google.firebase.messaging.FirebaseMessagingService;

public class NotificationsService extends FirebaseMessagingService {

        @Override
        public void onMessageReceived(RemoteMessage remoteMessage) {
            if (remoteMessage.getNotification() != null) {
                // 1 - Get message sent by Firebase
                String message = remoteMessage.getNotification().getBody();
                //2 - Show message in console
                Log.e("TAG", message);
            }
        }
}
