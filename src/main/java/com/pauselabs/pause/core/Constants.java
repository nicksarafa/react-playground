package com.pauselabs.pause.core;

/**
 * Pause constants
 */
public class Constants {

    private Constants() {}

    public static final class Message {

        private Message() {}

        /**
         * SMS PDU (Protocol Data Unit) intent extra
         */
        public static final String PDUS_EXTRA = "pdus";

        /**
         * Message Bundle Identifier String
         */
        public static final String MESSAGE_BUNDLE = "MESSAGE_BUNDLE";

        /**
         * Message Parcel Identifier String
         */
        public static final String MESSAGE_PARCEL = "MESSAGE_PARCEL";

        /**
         * Missed call preference
         */
        public static final String MISSED_CALL_PREFERENCE = "MISSED_CALL_PREFERENCE";

        /**
         * Missed phone call older state
         */
        public static final String PREFERENCE_OLDER_PHONE_STATE = "olderPhoneState";

        /**
         * Last missed call time
         */
        public static final String PREFERENCE_LAST_MISSED_CALL_TIME = "lastMissedCallTime";

        /**
         * Phone State Change Filter
         */
        public static final String PHONE_STATE_CHANGE_INTENT = "android.intent.action.PHONE_STATE";

        /**
         * Phone Number incoming call
         */
        public static final String PREFERENCE_LAST_CALL_NUMBER = "PREFERENCE_LAST_CALL_NUMBER";

        /**
         * Message recipient
         */
        public static final String PAUSE_MESSAGE_RECIPIENT_EXTRA = "PAUSE_MESSAGE_RECIPIENT_EXTRA";

        /**
         * Message Subject
         */
        public static final String SUBJECT = "Pause Message";

        /**
         * Pause Message type
         */
        public static final class Type {

            public static final int SMS_INCOMING = 0;
            public static final int SMS_OUTGOING = 1;
            public static final int SMS_PAUSE_OUTGOING = 2;
            public static final int PHONE_INCOMING = 3;
            public static final int PHONE_OUTGOING = 4;

        }

    }

    public static final class Session {

        private Session() {}

        public static final class Destroyer extends Creator { private Destroyer() {} }

        public static class Creator {

            private Creator() {}

            /**
             * Pause session created from custom message
             */
            public static final int CUSTOM = 0;

            /**
             * Pause session created from silence mode
             */
            public static final int SILENCE = 1;

            /**
             * Pause session created from driving mode
             */
            public static final int DRIVE = 2;

            /**
             * Pause session created from sleep mode
             */
            public static final int SLEEP = 3;

            /**
             * Pause session created from flip mode
             */
            public static final int FLIP = 4;

        }

    }

    public static final class Pause {

        private Pause() {}

        public static final String PAUSE_FIRST_LAUNCH_KEY = "PAUSE_FIRST_LAUNCH";
        public static final String PAUSE_FIRST_LAUNCH_TRUE = "PAUSE_FIRST_LAUNCH_TRUE";

        /**
         * Pause Bundle Identifier String
         */
        public static final String PAUSE_BUNDLE = "PAUSE_BUNDLE";

        /**
         * Pause Parcel Identifier String
         */
        public static final String PAUSE_PARCEL = "PAUSE_PARCEL";

        /**
         * Number of messages received that will trigger the sending of second bounce back
         */
        public static final int SECOND_BOUNCE_BACK_TRIGGER = 2;

        /**
         * Pause secondary Bounce Back message text
         */
        public static final String SECONDARY_BOUNCE_BACK_MESSAGE_TEXT = "You are receiving this auto response courtesy of Pause Away Messenger";

        /**
         * Pause Session Active
         */
        public static final int PAUSE_SESSION_STATE_ACTIVE = 0;

        /**
         * Pause Session Stopped
         */
        public static final int PAUSE_SESSION_STATE_STOPPED = 1;

        /**
         * Current Pause Message Parcel
         */
        public static final String PAUSE_MESSAGE_PARCEL = "PAUSE_MESSAGE_PARCEL";

        /**
         * Active Pause Message id saved in database
         */
        public static final String ACTIVE_PAUSE_DATABASE_ID_PREFS = "ACTIVE_PAUSE_DATABASE_ID_PREFS";

        /**
         * Edit Pause message extra
         */
        public static final String EDIT_PAUSE_MESSAGE_ID_EXTRA = "EDIT_PAUSE_MESSAGE_ID_EXTRA";
    }

    public static class Notification {
        private Notification() {
        }


        public static final int SESSION_NOTIFICATION_ID = 1000; // Why 1000? Why not? :)
        public static final int LOW_BATTERY_NOTIFICATION_ID = 1001;
        public static final int CHANGE_MODE_NOTIFICATION_ID = 1002;

        public static final int STOP_PAUSE_SESSION = 1010;
        public static final int EDIT_PAUSE_SESSION = 1011;
        public static final int NOT_SLEEPING = 1012;
        public static final int NOT_DRIVER = 1013;

        public static final int MODE_SILENCE = 1014;
        public static final int MODE_SLEEP = 1015;
        public static final int MODE_DRIVE = 1016;
        public static final int MODE_FLIP = 1016;

        public static final String PAUSE_NOTIFICATION_INTENT = "PAUSE_NOTIFICATION_INTENT";
        public static final String PAUSE_NOTIFICATION_STOP_SESSION  = "PAUSE_NOTIFICATION_STOP_SESSION";

        public static final String LOW_BATTERY_MESSAGE = "Low battery, start a Pause?";
    }

    public static class Settings {
        private Settings() {
        }

        public static final String PAUSE_ON_VIBRATE_KEY =  "PAUSE_ON_VIBRATE_KEY";

        public static final String NAME_KEY = "NAME_KEY";
        public static final String GENDER_KEY = "GENDER_KEY";
        public static final String GENDER_MALE_KEY = "Male";
        public static final String GENDER_MALE_VALUE = "he";
        public static final String GENDER_FEMALE_KEY = "Female";
        public static final String GENDER_FEMALE_VALUE = "she";
        public static final String REPLY_MISSED_CALL = "REPLY_MISSED_CALL_KEY";
        public static final String REPLY_SMS = "REPLY_SMS_KEY";
        public static final String USING_BLACKLIST = "USING_BLACKLIST";
        public static final String BLACKLIST = "BLACKLIST";

        /** jasonActionIds
         *
         */

        public static final int ACTION_CYCLE = 5000;
        public static final int ACTION_CHANGE_NAME = 5001;
        public static final int ACTION_CHANGE_GENDER = 5002;

        /**
         * M/S^2 acceleration in either x, y, or z axis
         */
        public static final float STILL_CONSTANT = 2.5f;

        /**
         * Time (in minutes) until the still accelerometer TimerTask times out
         */
        public static final float STILL_ACCELEROMETER_TIME_OUT = 10;

        /**
         * Time to activate Sleep Mode.
         */
        public static final int SLEEP_TIME_START = 23;

        /**
         * Time to deactivate Sleep Mode.
         */
        public static final int SLEEP_TIME_STOP = 7;
    }

    public static class Privacy {
        private Privacy() {}

        public static final String CONTACTS_ONLY = "Contacts Only";
        public static final String EVERYBODY = "Everybody";
        public static final String NOBODY = "Nobody";
    }

    public static class Gender {
        private Gender() {}

        public static final String MALE = "Male";
        public static final String FEMALE = "Female";
    }

}
